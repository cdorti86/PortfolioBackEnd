/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Logro;
import java.util.List;

/**
 *
 * @author cdcorti
 */
public interface ILogroService {
    public List<Logro> listaLogros();
    public void nuevoLogro (Logro logr);
    public void borrarLogro (Logro logr);
    public Logro buscarLogro (long id);
    public void modificarLogro (Logro logr);    
}
