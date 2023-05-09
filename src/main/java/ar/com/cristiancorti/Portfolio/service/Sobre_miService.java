/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Sobre_mi;
import ar.com.cristiancorti.Portfolio.repository.IRepoSobre_mi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cdcorti
 */
@Service

public class Sobre_miService implements ISobre_miService {

    @Autowired
    public IRepoSobre_mi sobre_miRepo;
    
    @Override
    public List<Sobre_mi> listaSobre_mi() {
        return sobre_miRepo.findAll();
    }

    @Override
    public void nuevoSobre_mi(Sobre_mi somi) {
        sobre_miRepo.save(somi);
    }

    @Override
    public void borrarSobre_mi(Sobre_mi somi) {
        sobre_miRepo.delete(somi);
    }

    @Override
    public Sobre_mi buscarSobre_mi(long id) {
        return sobre_miRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarSobre_mi(Sobre_mi somi) {
        sobre_miRepo.save(somi);
    }
    
}
