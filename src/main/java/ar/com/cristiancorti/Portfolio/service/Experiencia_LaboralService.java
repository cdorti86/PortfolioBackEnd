/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Experiencia_Laboral;
import ar.com.cristiancorti.Portfolio.repository.IRepoExperiencia_Laboral;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cdcorti
 */

@Service
public class Experiencia_LaboralService implements IExperiencia_LaboralService {

    @Autowired
    public IRepoExperiencia_Laboral experiencia_laboralRepo;
            

    @Override
    public List<Experiencia_Laboral> listaExperiencias_Laborales() {
        return experiencia_laboralRepo.findAll();
    }

    @Override
    public void nuevoExperiencia_Laboral(Experiencia_Laboral exla) {
        experiencia_laboralRepo.save(exla);
    }

    @Override
    public void borrarExperiencia_Laboral(Experiencia_Laboral exla) {
        experiencia_laboralRepo.delete(exla);
    }

    @Override
    public Experiencia_Laboral buscarExperiencia_Laboral(long id) {
        return experiencia_laboralRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarExperiencia_Laboral(Experiencia_Laboral exla) {
        experiencia_laboralRepo.save(exla);
    }
    
}
