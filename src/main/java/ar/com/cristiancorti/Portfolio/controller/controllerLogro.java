/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.controller;

import ar.com.cristiancorti.Portfolio.model.Logro;
import ar.com.cristiancorti.Portfolio.service.ILogroService;
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
public class controllerLogro {
    
    @Autowired
    private ILogroService ilogrosrv;
    
    @PostMapping("/nuevo/logro")
    public void agregarLogro(@RequestBody Logro logr) {
        ilogrosrv.nuevoLogro(logr);
    }
    
    @DeleteMapping("/delete/logro")
    public void borrarLogro (@RequestBody Logro logr) {
        ilogrosrv.borrarLogro(logr);
    }
    
    @GetMapping("/lista/logro")
    @ResponseBody
    public List<Logro> listadeLogros() {
        return ilogrosrv.listaLogros();
        
    }
    
    @GetMapping("/buscar/logro/{id}")
    public Logro buscarLogro (@PathVariable Long id) {
        return ilogrosrv.buscarLogro(id);
    }
    
    @PutMapping ("/modificar/logro")
    public void modificarLogro (@RequestBody Logro logr)
    {
        ilogrosrv.modificarLogro(logr);
    }
    
}
