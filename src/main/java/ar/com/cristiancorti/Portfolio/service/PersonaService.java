/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Persona;
import ar.com.cristiancorti.Portfolio.repository.IRepoPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cdcorti
 */
@Service

public class PersonaService implements IPersonaService {

    @Autowired
    public IRepoPersona personaRepo;
    
    @Override
    public List<Persona> listaPersonas() {
        return personaRepo.findAll();
    }

    @Override
    public void nuevoPersona(Persona pers) {
        personaRepo.save(pers);
    }

    @Override
    public void borrarPersona(Persona pers) {
        personaRepo.delete(pers);
    }

    @Override
    public Persona buscarPersona(long id) {
        return personaRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarPersona(Persona pers) {
        personaRepo.save(pers);
    }
    
}
