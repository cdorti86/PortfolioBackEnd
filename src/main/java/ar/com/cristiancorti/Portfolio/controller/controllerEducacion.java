/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.controller;

import ar.com.cristiancorti.Portfolio.model.Educacion;
import ar.com.cristiancorti.Portfolio.service.IEducacionService;
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
@CrossOrigin(origins={"https://miporfolio-79ced.web.app"})
@RestController

public class controllerEducacion {
    
    @Autowired
    private IEducacionService ieducacionsvc;
    
        @PostMapping("/nuevo/educacion")
    public void agregarEducacion(@RequestBody Educacion educ) {
        ieducacionsvc.nuevoEducacion(educ);
    }
    
    @DeleteMapping("/delete/educacion")
    public void borrarEducacion (@RequestBody Educacion educ) {
        ieducacionsvc.borrarEducacion(educ);
    }
    
    @DeleteMapping("/delete/educacion/{id}")
    public void borrarIdEducacion (@PathVariable Long id) {
        ieducacionsvc.borrarIdEducacion(id);
    }
    
    @GetMapping("/lista/educaciones")
    
    @ResponseBody
    public List<Educacion> listadeEducaciones() {
        return ieducacionsvc.listaEducaciones();
        
    }
    
    @GetMapping("/buscar/educacion/{id}")
    public Educacion buscarEducacion (@PathVariable Long id) {
        return ieducacionsvc.buscarEducacion(id);
    }

    @PutMapping ("/modificar/educacion")
    public void modificarEducacion (@RequestBody Educacion educ)
    {
        ieducacionsvc.modificarEducacion(educ);
    }
    
}
