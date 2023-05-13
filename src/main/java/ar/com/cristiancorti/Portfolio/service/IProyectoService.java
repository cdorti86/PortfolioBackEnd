/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Proyecto;
import java.util.List;

/**
 *
 * @author cdcorti
 */
public interface IProyectoService {
    public List<Proyecto> listaProyectos();
    public void nuevoProyecto (Proyecto proy);
    public void borrarProyecto(Proyecto proy);
    public void borrarIdProyecto (long id);
    public Proyecto buscarProyecto (long id);
    public void modificarProyecto (Proyecto proy);       
}
