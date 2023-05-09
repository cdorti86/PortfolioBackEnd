/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Persona;
import java.util.List;

/**
 *
 * @author cdcorti
 */
public interface IPersonaService {
    public List<Persona> listaPersonas();
    public void nuevoPersona (Persona pers);
    public void borrarPersona(Persona pers);
    public Persona buscarPersona (long id);
    public void modificarPersona (Persona pers);    
}
