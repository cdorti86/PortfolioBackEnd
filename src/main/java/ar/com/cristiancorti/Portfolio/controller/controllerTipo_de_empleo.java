/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.controller;

import ar.com.cristiancorti.Portfolio.model.Tipo_de_empleo;
import ar.com.cristiancorti.Portfolio.service.ITipo_de_empleoService;
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
public class controllerTipo_de_empleo {
    
    @Autowired
    private ITipo_de_empleoService itipo_de_empleosvc;
    
    @PostMapping("/nuevo/tipo_de_empleo")
    public void agregarTipo_de_empleo(@RequestBody Tipo_de_empleo tiem) {
        itipo_de_empleosvc.nuevoTipo_de_empleo(tiem);
    }
    
    @DeleteMapping("/delete/tipo_de_empleo")
    public void borrarTipo_de_empleo (@RequestBody Tipo_de_empleo tiem) {
        itipo_de_empleosvc.borrarTipo_de_empleo(tiem);
    }
    
    @GetMapping("/lista/tipo_de_empleos")
    @ResponseBody
    public List<Tipo_de_empleo> listadeTipo_de_empleos() {
        return itipo_de_empleosvc.listaTipo_de_empleos();
        
    }
    
    @GetMapping("/buscar/tipo_de_empleo/(id)")
    public Tipo_de_empleo buscarTipo_de_empleo (@PathVariable Long id) {
        return itipo_de_empleosvc.buscarTipo_de_empleo(id);
    }
    
    @PutMapping ("/modificar/tipo_de_empleo")
    public void modificarTipo_de_empleo (@RequestBody Tipo_de_empleo tiem)
    {
        itipo_de_empleosvc.modificarTipo_de_empleo(tiem);
    }
}
