/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.service;

import ar.com.cristiancorti.Portfolio.model.Experiencia_Laboral;
import java.util.List;

/**
 *
 * @author cdcorti
 */
public interface IExperiencia_LaboralService {
    public List<Experiencia_Laboral> listaExperiencias_Laborales();
    public void nuevoExperiencia_Laboral (Experiencia_Laboral exla);
    public void borrarExperiencia_Laboral (Experiencia_Laboral exla);
    public void borrarIdExperiencia_Laboral(long id);
    public Experiencia_Laboral buscarExperiencia_Laboral (long id);
    public void modificarExperiencia_Laboral (Experiencia_Laboral exla);    
}
