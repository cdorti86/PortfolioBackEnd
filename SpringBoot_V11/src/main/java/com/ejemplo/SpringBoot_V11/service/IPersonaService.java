/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.SpringBoot_V11.service;

import com.ejemplo.SpringBoot_V11.model.Persona;
import java.util.List;

/**
 *
 * @author cdcorti
 */
public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    public void crearPersona (Persona pers);
    public void borrarPersona (Long Id);
    public Persona buscarPersona (Long Id);
    
    
}
