/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.controller;

import ar.com.cristiancorti.Portfolio.model.Provincia;
import ar.com.cristiancorti.Portfolio.service.IProvinciaService;
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
public class controllerProvincia {
    
    @Autowired
    private IProvinciaService iprovinciasvc;

    @PostMapping("/nuevo/provincia")
    public void agregarProvincia(@RequestBody Provincia prov) {
        iprovinciasvc.nuevoProvincia(prov);
    }
    
    @DeleteMapping("/delete/provincia")
    public void borrarProvincia (@RequestBody Provincia prov) {
        iprovinciasvc.borrarProvincia(prov);
    }
    
    @GetMapping("/lista/provincias")
    @ResponseBody
    public List<Provincia> listadeProvincias() {
        return iprovinciasvc.listaProvincias();
        
    }
    
    @GetMapping("/buscar/provincia/(id)")
    public Provincia buscarProvincia (@PathVariable Long id) {
        return iprovinciasvc.buscarProvincia(id);
    }
    
    @PutMapping ("/modificar/provincia")
    public void modificarProvincia (@RequestBody Provincia prov)
    {
        iprovinciasvc.modificarProvincia(prov);
    }    
}
