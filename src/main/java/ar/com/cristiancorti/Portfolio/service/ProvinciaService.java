/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Provincia;
import ar.com.cristiancorti.Portfolio.repository.IRepoProvincia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cdcorti
 */
@Service

public class ProvinciaService implements IProvinciaService {

    @Autowired
    public IRepoProvincia provinciaRepo;
    
    @Override
    public List<Provincia> listaProvincias() {
        return provinciaRepo.findAll();
    }

    @Override
    public void nuevoProvincia(Provincia prov) {
        provinciaRepo.save(prov);
    }

    @Override
    public void borrarProvincia(Provincia prov) {
        provinciaRepo.delete(prov);
    }

    @Override
    public Provincia buscarProvincia(long id) {
        return provinciaRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarProvincia(Provincia prov) {
        provinciaRepo.save(prov);
    }
    
}
