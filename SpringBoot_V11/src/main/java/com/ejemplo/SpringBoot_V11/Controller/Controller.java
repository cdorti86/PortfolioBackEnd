/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot_V11.Controller;

import com.ejemplo.SpringBoot_V11.model.Persona;
import com.ejemplo.SpringBoot_V11.service.IPersonaService;
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

        
@RestController

/**
 *
 * @author cdcorti
 */
public class Controller {
    
    @Autowired
    private IPersonaService persoServ ;
    
/**    @GetMapping ("/may")
    public String decirHola () {
            return "Hola Hermosa - TE AMO!!!!" ;


/** 
@GetMapping ("/hola/{nombre}/{apellido}/{edad}")
public String decirHola (@PathVariable String nombre,
        @PathVariable String apellido, @PathVariable int edad) {
    return "Hola mundo " + nombre + " apellido:" + apellido + " edad:" + edad;
}

    List<Persona> listaPersonas = new ArrayList ();
 
 /**   @GetMapping ("/hola/{{acanombre}/{acaapellido}/{edad}")
    public String decirHola(@PathVariable String acanombre, 
            @PathVariable String acaapellido, @PathVariable int edad) {
        
        return "Hola Mundo" + acanombre + " apellido:" + acaapellido +" edad:" + edad;
    }
  
    
    @GetMapping ("/Chau")
    public String decirChau (@RequestParam String acanombre,
            @RequestParam String acaapellido, @RequestParam int edad){
        
        return "Chau Mundo" + acanombre + " apellido:" +acaapellido +" edad:" + edad;
    }   
   
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers) {
        listaPersonas.add(pers);
        
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas () {
        return listaPersonas;
    }
   /** 
    @PutMapping ("/modificar/persona")
    public void modificarPersona (@RequestBody Persona pers) {
        listaPersonas.set(pers);
    }
    
    
    @DeleteMapping ("eliminar/persona")
    @ResponseBody
    public void eliminarPersona (@RequestBody Persona pers) {
        listaPersonas.remove(pers);
    }
    */
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas () {
        return persoServ.verPersonas() ;
    }
    
    @DeleteMapping ("/delete/{id}")
    
    public void borrarPersona (@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }
    
    @PutMapping ("/modificar/persona")
    public void modificarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/buscar/{id}")
    public Persona buscarPersona (@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    }
}
