/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Provincia;
import java.util.List;

/**
 *
 * @author cdcorti
 */
public interface IProvinciaService {
    public List<Provincia> listaProvincias();
    public void nuevoProvincia (Provincia prov);
    public void borrarProvincia (Provincia prov);
    public Provincia buscarProvincia (long id);
    public void modificarProvincia (Provincia prov);    
}
