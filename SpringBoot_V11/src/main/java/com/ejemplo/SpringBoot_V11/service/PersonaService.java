/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot_V11.service;

import com.ejemplo.SpringBoot_V11.model.Persona;
import com.ejemplo.SpringBoot_V11.repository.PersonaRepository;
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
    
    public PersonaRepository persoRepo ;
            
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
          }

    @Override
    public void crearPersona(Persona pers) {
        persoRepo.save(pers);
    }

    @Override
    public void borrarPersona(Long Id) {
        persoRepo.deleteById(Id);
    }

    @Override
    public Persona buscarPersona(Long Id) {
        return persoRepo.findById(Id).orElse(null);
    }
    
}
