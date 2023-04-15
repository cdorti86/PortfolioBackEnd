/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Logro;
import ar.com.cristiancorti.Portfolio.repository.IRepoLogro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cdcorti
 */
@Service
public class LogroService implements ILogroService{

    @Autowired
    public IRepoLogro logroRepo;
    
    @Override
    public List<Logro> listaLogros() {
        return logroRepo.findAll() ;
    }

    @Override
    public void nuevoLogro(Logro logr) {
        logroRepo.save(logr);
    }

    @Override
    public void borrarLogro(Logro logr) {
        logroRepo.delete(logr);
    }

    @Override
    public Logro buscarLogro(long id) {
        return logroRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarLogro(Logro logr) {
        logroRepo.save(logr);
    }
    
}
