/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Login;
import ar.com.cristiancorti.Portfolio.repository.IRepoLogin;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cdcorti
 */
@Service
public class LoginService implements ILoginService {
    
    @Autowired
    public IRepoLogin loginRepo ;

    @Override
    public List<Login> listaLogin() {
        return loginRepo.findAll();
    }

    @Override
    public void nuevoLogin(Login log) {
        loginRepo.save(log);
    }

    @Override
    public void borrarLogin(Login log) {
        loginRepo.delete(log);
    }

    @Override
    public Login buscarLogin(long id) {
        return loginRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarIdLogin(long id) {
        loginRepo.deleteById(id);
    }

    @Override
    public void modificarLogin(Login log) {
        loginRepo.save(log);
    }
    
}
