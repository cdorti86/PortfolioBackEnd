/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Proyecto;
import ar.com.cristiancorti.Portfolio.repository.IRepoProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cdcorti
 */

@Service
public class ProyectoService implements IProyectoService {
    @Autowired
    public IRepoProyecto proyectoRepo ;

    @Override
    public List<Proyecto> listaProyectos() {
    return proyectoRepo.findAll();
    }

    @Override
    public void nuevoProyecto(Proyecto proy) {
    proyectoRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Proyecto proy) {
    proyectoRepo.delete(proy);
    }

    @Override
    public Proyecto buscarProyecto(long id) {
    return proyectoRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarProyecto(Proyecto proy) {
    proyectoRepo.save(proy);
    }

    @Override
    public void borrarIdProyecto(long id) {
            proyectoRepo.deleteById(id);
    }
    
}
