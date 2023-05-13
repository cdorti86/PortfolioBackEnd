/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Validacion;
import ar.com.cristiancorti.Portfolio.repository.IRepoValidacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cdcorti
 */
@Service

public class ValidacionService implements IValidacionService {

    @Autowired
    public IRepoValidacion validacionRepo;
    @Override
    public List<Validacion> listavalidaciones() {
        return validacionRepo.findAll();
    }

    @Override
    public void nuevoValidacion(Validacion vali) {
        validacionRepo.save(vali);
    }

    @Override
    public void borrarValidacion(Validacion vali) {
        validacionRepo.delete(vali);
    }

    @Override
    public Validacion buscarValidacion(long id) {
        return validacionRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarValidacion(Validacion vali) {
        validacionRepo.save(vali);
    }

    @Override
    public void borrarIdValidacion(long id) {
            validacionRepo.deleteById(id); 
    }
    
}
