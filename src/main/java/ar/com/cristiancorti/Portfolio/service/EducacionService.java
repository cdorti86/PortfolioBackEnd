/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Educacion;
import ar.com.cristiancorti.Portfolio.repository.IRepoEducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cdcorti
 */

@Service
public class EducacionService implements IEducacionService {

    @Autowired
    public IRepoEducacion educacionRepo;
    
    @Override
    public List<Educacion> listaEducaciones() {
        return educacionRepo.findAll();
    }

    @Override
    public void nuevoEducacion(Educacion educ) {
        educacionRepo.save(educ);
    }

    @Override
    public void borrarEducacion(Educacion educ) {
        educacionRepo.delete(educ);
    }

    @Override
    public Educacion buscarEducacion(long id) {
        return educacionRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarEducacion(Educacion educ) {
        educacionRepo.save(educ);
    }

    @Override
    public void borrarIdEducacion(long id) {
        educacionRepo.deleteById(id);
    }
    
}
