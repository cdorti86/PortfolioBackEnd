/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Educacion;
import java.util.List;

/**
 *
 * @author cdcorti
 */
public interface IEducacionService {
    public List<Educacion> listaEducaciones();
    public void nuevoEducacion (Educacion educ);
    public void borrarEducacion (Educacion educ);
    public Educacion buscarEducacion (long id);
    public void modificarEducacion (Educacion educ);    
}
