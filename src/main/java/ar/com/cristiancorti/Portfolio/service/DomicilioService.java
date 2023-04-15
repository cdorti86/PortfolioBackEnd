/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Domicilio;
import ar.com.cristiancorti.Portfolio.repository.IRepoDomicilio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cdcorti
 */

@Service
public class DomicilioService implements IDomicilioService {
    
    @Autowired
    public IRepoDomicilio domicilioRepo ;

    @Override
    public List<Domicilio> listaDomicilios() {
        return domicilioRepo.findAll();
    }

    @Override
    public void nuevoDomicilio(Domicilio domi) {
        domicilioRepo.save(domi);
    }

    @Override
    public void borrarDomicilio(Domicilio domi) {
        domicilioRepo.delete(domi);
    }

    @Override
    public Domicilio buscarDomicilio(long id) {
        return domicilioRepo.findById(id).orElse(null);
        
    }

    @Override
    public void modificarDomicilio(Domicilio domi) {
        domicilioRepo.save(domi);
    }
    
    
}
