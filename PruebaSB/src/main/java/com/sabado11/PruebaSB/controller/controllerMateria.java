/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabado11.PruebaSB.controller;

import com.sabado11.PruebaSB.model.Materia;
import com.sabado11.PruebaSB.service.IMateriaService;
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
public class controllerMateria {
    
    @Autowired 
    private IMateriaService imateriasvc;
    
    @PostMapping("/materia/nuevo")
    public void agregarMateria(@RequestBody Materia m){
        imateriasvc.nuevaMateria(m);
    }
    
    @DeleteMapping("/materia/borra")
    public void borrarMateria(@RequestBody Materia m){
        imateriasvc.borrarMateria(m);
    }
    
    @GetMapping("/lista/materias")
    @ResponseBody
    public List<Materia> listadeMaterias(){
        return imateriasvc.listaMaterias();
        
    }
    
    @GetMapping("/buscar/materia/{id}")
    @ResponseBody
    public Materia buscarMateria(@PathVariable Long id){
        return imateriasvc.buscarMateria(id);
    }
    
    @PutMapping("/modificar/materia")
    public void modificarMateria(@RequestBody Materia m){
        imateriasvc.modificarMateria(m);
    }
}
