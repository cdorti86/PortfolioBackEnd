/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabado11.PruebaSB.controller;

import com.sabado11.PruebaSB.model.Alumno;
import com.sabado11.PruebaSB.service.IAlumnoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cdcorti
 */

@RestController
public class controllerAlumno {
    
    @Autowired 
    private IAlumnoService ialumnosvc;
    
    @PostMapping("/nuevo/alumno")
    public void agregarAlumno(@RequestBody Alumno a){
        ialumnosvc.nuevoAlumno(a);
    }
    
    @DeleteMapping("/delete")
    public void borrarAlumno(@RequestBody Alumno a){
        ialumnosvc.borrarAlumno(a);
    }
    
    @GetMapping("/lista/alumnos")
    @ResponseBody
    public List<Alumno> listadeAlumnos(){
        return ialumnosvc.listaAlumnos();
        
    }
   
    @GetMapping("/buscar/alumno/{id}")
    public Alumno buscarAlumno(@PathVariable Long id){
        return ialumnosvc.buscarAlumno(id);
    }
    
    @PutMapping("/modificar/alumno")
    public void modificarAlumno(@RequestBody Alumno a){
        ialumnosvc.modificarAlumno(a);
    }
}
