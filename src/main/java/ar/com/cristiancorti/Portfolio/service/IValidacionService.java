/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Validacion;
import java.util.List;

/**
 *
 * @author cdcorti
 */
public interface IValidacionService {
    public List<Validacion> listavalidaciones();
    public void nuevoValidacion (Validacion vali);
    public void borrarValidacion (Validacion vali);
    public void borrarIdValidacion (long id);
    public Validacion buscarValidacion (long id);
    public void modificarValidacion (Validacion vali);    
}
