/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.controller;

import ar.com.cristiancorti.Portfolio.model.Domicilio;
import ar.com.cristiancorti.Portfolio.service.IDomicilioService;
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
public class controllerDomicilio {
    @Autowired
    private IDomicilioService idomiciliosvc;
    
    @PostMapping("/nuevo/domicilio")
    public void agregarAptitud(@RequestBody Domicilio domi) {
        idomiciliosvc.nuevoDomicilio(domi);
    }
    
    @DeleteMapping("/delete/domicilio")
    public void borrarDomicilio (@RequestBody Domicilio domi) {
        idomiciliosvc.borrarDomicilio(domi);
    }
    
    @GetMapping("/lista/domicilios")
    @ResponseBody
    public List<Domicilio> listadeDomicilios() {
        return idomiciliosvc.listaDomicilios();
        
    }
    
    @GetMapping("/buscar/domicilio/{id}")
    public Domicilio buscarDomicilio (@PathVariable Long id) {
        return idomiciliosvc.buscarDomicilio(id);
    }
    
    @PutMapping ("/modificar/domicilio")
    public void modificarDomicilio (@RequestBody Domicilio domi)
    {
        idomiciliosvc.modificarDomicilio(domi);
    }
    
}
