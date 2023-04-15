/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.controller;

import ar.com.cristiancorti.Portfolio.model.Localidad;
import ar.com.cristiancorti.Portfolio.service.ILocalidadService;
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
public class controllerLocalidad {
    
    @Autowired
    private ILocalidadService ilocalidadsvc;
    
    @PostMapping("/nuevo/localidad")
    public void agregarLocalidad(@RequestBody Localidad loca) {
        ilocalidadsvc.nuevoLocalidad(loca);
    }
    
    @DeleteMapping("/delete/localidad")
    public void borrarLocalidad (@RequestBody Localidad loca) {
        ilocalidadsvc.borrarLocalidad(loca);
    }
    
    @GetMapping("/lista/localidades")
    @ResponseBody
    public List<Localidad> listadeLocalidades() {
        return ilocalidadsvc.listaLocalidades();
        
    }
    
    @GetMapping("/buscar/localidad/(id)")
    public Localidad buscarLocalidad (@PathVariable Long id) {
        return ilocalidadsvc.buscarLocalidad(id);
    }
    
    @PutMapping ("/modificar/localidad")
    public void modificarLocalidad (@RequestBody Localidad loca)
    {
        ilocalidadsvc.modificarLocalidad(loca);
    }    
}
