/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabado11.PruebaSB.service;

import com.sabado11.PruebaSB.model.Materia;
import com.sabado11.PruebaSB.repository.IRepoAlumno;
import com.sabado11.PruebaSB.repository.IRepoMateria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author cdcorti
 */
@Service
public class MateriaService implements IMateriaService{

     @Autowired
    public IRepoMateria materiaRepo;   

    @Override
    public List<Materia> listaMaterias() {
        return materiaRepo.findAll();
    }

    @Override
    public void nuevaMateria(Materia m) {
        materiaRepo.save(m);
    }

    @Override
    public void borrarMateria(Materia m) {
        materiaRepo.delete(m);
    }

    @Override
    public Materia buscarMateria(long id) {
        return materiaRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarMateria(Materia m) {
        materiaRepo.save(m);
    }

}
