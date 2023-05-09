/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Sobre_mi;
import java.util.List;

/**
 *
 * @author cdcorti
 */
public interface ISobre_miService {
    public List<Sobre_mi> listaSobre_mi();
    public void nuevoSobre_mi (Sobre_mi somi);
    public void borrarSobre_mi (Sobre_mi somi);
    public Sobre_mi buscarSobre_mi (long id);
    public void modificarSobre_mi (Sobre_mi somi);    
}
