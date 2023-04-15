/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Localidad;
import ar.com.cristiancorti.Portfolio.repository.IRepoLocalidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cdcorti
 */

@Service
public class LocalidadService implements ILocalidadService {

    @Autowired
    public IRepoLocalidad localidadRepo;
    
    @Override
    public List<Localidad> listaLocalidades() {
        return localidadRepo.findAll();
    }

    @Override
    public void nuevoLocalidad(Localidad loca) {
        localidadRepo.save(loca);
    }

    @Override
    public void borrarLocalidad(Localidad loca) {
        localidadRepo.delete(loca);
    }

    @Override
    public Localidad buscarLocalidad(long id) {
        return localidadRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarLocalidad(Localidad loca) {
        localidadRepo.save(loca);
    }
    
}
