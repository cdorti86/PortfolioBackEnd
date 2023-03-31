/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sabado11.PruebaSB.service;

import com.sabado11.PruebaSB.model.Alumno;
import com.sabado11.PruebaSB.model.Materia;
import java.util.List;

/**
 *
 * @author cdcorti
 */
public interface IAlumnoService {
    public List<Alumno> listaAlumnos();
    public void nuevoAlumno (Alumno a);
    public void borrarAlumno (Alumno a);
    public Alumno buscarAlumno (long id);
    public void modificarAlumno (Alumno a);
    public void agregarMateria (Alumno a, Materia m);
    
}
