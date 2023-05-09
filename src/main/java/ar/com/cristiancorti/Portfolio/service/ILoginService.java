/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Login;
import java.util.List;

/**
 *
 * @author cdcorti
 */
public interface ILoginService {
    public List<Login> listaLogin();
    public void nuevoLogin (Login log);
    public void borrarLogin (Login log);
    public Login buscarLogin (long id);
    public void borrarIdLogin(long id);
    public void modificarLogin (Login log);       
}
