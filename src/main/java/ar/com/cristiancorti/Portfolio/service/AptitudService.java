/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Aptitud;
import ar.com.cristiancorti.Portfolio.repository.IRepoAptitud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cdcorti
 */

@Service
public class AptitudService implements IAptitudService {

    @Autowired
    public IRepoAptitud aptitudRepo ;
            
    @Override
    public List<Aptitud> listaAptitudes() {
      return aptitudRepo.findAll();
    }

    @Override
    public void nuevoAptitud(Aptitud apti) {
        aptitudRepo.save (apti);
    }

    @Override
    public void borrarAptitud(Aptitud apti) {
        aptitudRepo.delete(apti);
    }

    @Override
    public Aptitud buscarAptitud(long id) {
        return aptitudRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarAptitud(Aptitud apti) {
        aptitudRepo.save (apti);
    }
    
}
