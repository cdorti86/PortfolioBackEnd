/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.controller;

import ar.com.cristiancorti.Portfolio.model.Sobre_mi;
import ar.com.cristiancorti.Portfolio.service.ISobre_miService;
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
public class controllerSobre_mi {
    
    @Autowired
    private ISobre_miService isobre_misvc;
    
    @PostMapping("/nuevo/sobre_mi")
    public void agregarSobre_mi(@RequestBody Sobre_mi somi) {
        isobre_misvc.nuevoSobre_mi(somi);
    }
    
    @DeleteMapping("/delete/sobre_mi")
    public void borrarSobre_mi (@RequestBody Sobre_mi somi) {
        isobre_misvc.borrarSobre_mi(somi);
    }
    
    @GetMapping("/lista/sobre_mi")
    @ResponseBody
    public List<Sobre_mi> listadeSobre_mi() {
        return isobre_misvc.listaSobre_mi();
        
    }
    
    @GetMapping("/buscar/sobre_mi/{id}")
    public Sobre_mi buscarAlumno (@PathVariable Long id) {
        return isobre_misvc.buscarSobre_mi(id);
    }
    
    @PutMapping ("/modificar/sobre_mi")
    public void modificarSobre_mi (@RequestBody Sobre_mi somi)
    {
        isobre_misvc.modificarSobre_mi(somi);
    }
}
