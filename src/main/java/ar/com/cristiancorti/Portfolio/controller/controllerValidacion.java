/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.controller;

import ar.com.cristiancorti.Portfolio.model.Validacion;
import ar.com.cristiancorti.Portfolio.service.IValidacionService;
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
public class controllerValidacion {
    
    @Autowired
    private IValidacionService ivalidacionsvc;

    @PostMapping("/nuevo/validacion")
    public void agregarValidacion(@RequestBody Validacion vali) {
        ivalidacionsvc.nuevoValidacion(vali);
    }
    
    @DeleteMapping("/delete/validacion")
    public void borrarValidacion (@RequestBody Validacion vali) {
        ivalidacionsvc.borrarValidacion(vali);
    }
    
    @DeleteMapping("/delete/validacion/{id}")
    public void borrarIdValidacion (@PathVariable Long id) {
        ivalidacionsvc.borrarIdValidacion(id);
    }    

    @GetMapping("/lista/validaciones")
    @ResponseBody
    public List<Validacion> listadeValidaciones() {
        return ivalidacionsvc.listavalidaciones();
        
    }
    
    @GetMapping("/buscar/validacion/{id}")
    public Validacion buscarValidacion (@PathVariable Long id) {
        return ivalidacionsvc.buscarValidacion(id);
    }
    
    @PutMapping ("/modificar/validacion")
    public void modificarValidacion (@RequestBody Validacion vali)
    {
        ivalidacionsvc.modificarValidacion(vali);
    }    
}
