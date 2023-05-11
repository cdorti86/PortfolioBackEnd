/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.controller;

import ar.com.cristiancorti.Portfolio.model.Persona;
import ar.com.cristiancorti.Portfolio.service.IPersonaService;
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
@CrossOrigin(origins = {"https://miporfolio-79ced.web.app"})
@RestController
public class controllerPersona {
    
    @Autowired
    private IPersonaService ipersonasvc;
    
    @PostMapping("/nuevo/persona")
    public void agregarPersona(@RequestBody Persona pers) {
        ipersonasvc.nuevoPersona(pers);
    }
    
    @DeleteMapping("/delete/persona")
    public void borrarPersona (@RequestBody Persona pers) {
        ipersonasvc.borrarPersona(pers);
    }
    
    @GetMapping("/lista/personas")
    @ResponseBody
    public List<Persona> listadePersonas() {
        return ipersonasvc.listaPersonas();
        
    }
    
    @GetMapping("/buscar/persona/{id}")
    public Persona buscarPersona (@PathVariable Long id) {
        return ipersonasvc.buscarPersona(id);
    }
    
    @PutMapping ("/modificar/persona")
    public void modificarPersona (@RequestBody Persona pers)
    {
        ipersonasvc.modificarPersona(pers);
    }
    
}
