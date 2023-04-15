/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Tipo_de_empleo;
import ar.com.cristiancorti.Portfolio.repository.IRepoTipo_de_empleo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cdcorti
 */

@Service
public class Tipo_de_empleoService implements ITipo_de_empleoService {

    @Autowired
    public IRepoTipo_de_empleo Tipo_de_empleoRepo;
    
    @Override
    public List<Tipo_de_empleo> listaTipo_de_empleos() {
        return Tipo_de_empleoRepo.findAll();
    }

    @Override
    public void nuevoTipo_de_empleo(Tipo_de_empleo tiem) {
        Tipo_de_empleoRepo.save(tiem);
    }

    @Override
    public void borrarTipo_de_empleo(Tipo_de_empleo tiem) {
        Tipo_de_empleoRepo.delete(tiem);
    }

    @Override
    public Tipo_de_empleo buscarTipo_de_empleo(long id) {
        return Tipo_de_empleoRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarTipo_de_empleo(Tipo_de_empleo tiem) {
        Tipo_de_empleoRepo.save(tiem);
    }
    
}
