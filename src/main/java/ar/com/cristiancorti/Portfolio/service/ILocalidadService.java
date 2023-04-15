/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Localidad;
import java.util.List;

/**
 *
 * @author cdcorti
 */
public interface ILocalidadService {
    public List<Localidad> listaLocalidades();
    public void nuevoLocalidad (Localidad loca);
    public void borrarLocalidad (Localidad loca);
    public Localidad buscarLocalidad (long id);
    public void modificarLocalidad (Localidad loca);    
}
