/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sabado11.PruebaSB.service;

import com.sabado11.PruebaSB.model.Materia;
import java.util.List;

/**
 *
 * @author cdcorti
 */
public interface IMateriaService {
    public List<Materia> listaMaterias();
    public void nuevaMateria (Materia m);
    public void borrarMateria (Materia m);
    public Materia buscarMateria (long id);
    public void modificarMateria (Materia m);
    
}
