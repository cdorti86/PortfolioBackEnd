/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabado11.PruebaSB.service;

import com.sabado11.PruebaSB.model.Alumno;
import com.sabado11.PruebaSB.model.Materia;
import com.sabado11.PruebaSB.repository.IRepoAlumno;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cdcorti
 */
@Service
public class AlumnoService implements IAlumnoService {

    @Autowired
    public IRepoAlumno alumnoRepo;
    
    @Override
    public List<Alumno> listaAlumnos() {
      return alumnoRepo.findAll();
    }

    @Override
    public void nuevoAlumno(Alumno a) {
      alumnoRepo.save(a);
    }

    @Override
    public void borrarAlumno(Alumno a) {
       alumnoRepo.delete(a);
    }

    @Override
    public Alumno buscarAlumno(long id) {
       return alumnoRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarAlumno(Alumno a) {
       alumnoRepo.save(a);
    }
    
    @Override
    public void agregarMateria(Alumno a, Materia m) {
        alumnoRepo.save(a);
    }
}
