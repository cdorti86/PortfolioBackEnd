/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.controller;

import ar.com.cristiancorti.Portfolio.model.Proyecto;
import ar.com.cristiancorti.Portfolio.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

@CrossOrigin(origins="*")
@RestController
public class controllerProyecto {
    
    @Autowired
    private IProyectoService iproyectosvc; 

    @PostMapping("/nuevo/proyecto")
    public void agregarProyecto(@RequestBody Proyecto proy) {
        iproyectosvc.nuevoProyecto(proy);
    }
    
    @DeleteMapping("/delete/proyecto")
    public void borrarPersona (@RequestBody Proyecto proy) {
        iproyectosvc.borrarProyecto(proy);
    }
    
    @GetMapping("/lista/proyectos")
    @ResponseBody
    public List<Proyecto> listadeProyectos() {
        return iproyectosvc.listaProyectos();
        
    }
    
    @GetMapping("/buscar/proyecto/{id}")
    public Proyecto buscarProyecto (@PathVariable Long id) {
        return iproyectosvc.buscarProyecto(id);
    }
    
    @PutMapping ("/modificar/proyecto")
    public void modificarProyecto (@RequestBody Proyecto proy)
    {
        iproyectosvc.modificarProyecto(proy);
    }
}
