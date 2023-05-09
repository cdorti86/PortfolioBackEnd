/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Domicilio;
import java.util.List;

/**
 *
 * @author cdcorti
 */
public interface IDomicilioService {
    public List<Domicilio> listaDomicilios();
    public void nuevoDomicilio (Domicilio domi);
    public void borrarDomicilio (Domicilio domi);
    public Domicilio buscarDomicilio (long id);
    public void modificarDomicilio (Domicilio domi);
}
