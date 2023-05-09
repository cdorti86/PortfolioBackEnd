/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Aptitud;
import java.util.List;

/**
 *
 * @author cdcorti
 */
public interface IAptitudService {
    public List<Aptitud> listaAptitudes();
    public void nuevoAptitud (Aptitud apti);
    public void borrarAptitud (Aptitud apti);
    public void borrarIdAptitud (long id);
    public Aptitud buscarAptitud (long id);
    public void modificarAptitud (Aptitud apti); 
}
