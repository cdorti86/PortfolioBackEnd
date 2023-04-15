/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.controller;

import ar.com.cristiancorti.Portfolio.model.Aptitud;
import ar.com.cristiancorti.Portfolio.service.IAptitudService;
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
public class controllerAptitud {
    
    @Autowired
    private IAptitudService iaptitudsvc ;

    @PostMapping("/nuevo/aptitud")
    public void agregarAptitud (@RequestBody Aptitud apti) {
        iaptitudsvc.nuevoAptitud(apti);
    }
    
    @DeleteMapping("/delete/aptitud")
    public void borrarAptitud (@RequestBody Aptitud apti) {
        iaptitudsvc.borrarAptitud(apti);
    }
    
    @GetMapping("/lista/aptitudes")
    @ResponseBody
    public List<Aptitud> listadeAptitudes() {
        return iaptitudsvc.listaAptitudes();
        
    }
    
    @GetMapping("/buscar/aptitud/(id)")
    public Aptitud buscarAptitud (@PathVariable Long id) {
        return iaptitudsvc.buscarAptitud(id);
    }
    
    @PutMapping ("/modificar/aptitud")
    public void modificarAptitud (@RequestBody Aptitud apti)
    {
        iaptitudsvc.modificarAptitud(apti);
    
}
}
