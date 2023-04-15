/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Tipo_de_empleo;
import java.util.List;

/**
 *
 * @author cdcorti
 */
public interface ITipo_de_empleoService {
    public List<Tipo_de_empleo> listaTipo_de_empleos();
    public void nuevoTipo_de_empleo (Tipo_de_empleo tiem);
    public void borrarTipo_de_empleo (Tipo_de_empleo tiem);
    public Tipo_de_empleo buscarTipo_de_empleo (long id);
    public void modificarTipo_de_empleo (Tipo_de_empleo tiem);    
}
