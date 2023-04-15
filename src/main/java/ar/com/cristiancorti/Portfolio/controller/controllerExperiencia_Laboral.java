/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.controller;

import ar.com.cristiancorti.Portfolio.model.Experiencia_Laboral;
import ar.com.cristiancorti.Portfolio.service.IExperiencia_LaboralService;
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
public class controllerExperiencia_Laboral {
    
    @Autowired
    private IExperiencia_LaboralService iexperiencia_laboralsvc;
    
    @PostMapping("/nuevo/experiencia_laboral")
    public void agregarExperiencia_Laboral(@RequestBody Experiencia_Laboral exla) {
        iexperiencia_laboralsvc.nuevoExperiencia_Laboral(exla);
    }
    
    @DeleteMapping("/delete/experiencia_laboral")
    public void borrarExperiencia_Laboral (@RequestBody Experiencia_Laboral exla) {
        iexperiencia_laboralsvc.borrarExperiencia_Laboral(exla);
    }
    
    @GetMapping("/lista/experiencias_laborales")
    @ResponseBody
    public List<Experiencia_Laboral> listadeExperiencias_Laborales() {
        return iexperiencia_laboralsvc.listaExperiencias_Laborales();
        
    }
    
    @GetMapping("/buscar/experiencia_laboral/(id)")
    public Experiencia_Laboral buscarExperiencia_Laboral (@PathVariable Long id) {
        return iexperiencia_laboralsvc.buscarExperiencia_Laboral(id);
    }
    
    @PutMapping ("/modificar/experiencia_laboral")
    public void modificarExperiencia_Laboral (@RequestBody Experiencia_Laboral exla)
    {
        iexperiencia_laboralsvc.modificarExperiencia_Laboral(exla);
    }    
}
