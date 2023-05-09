/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author cdcorti
 */
@Entity
@Getter @Setter
public class Experiencia_Laboral {
    
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    Long id;
    String NombreEmpresa;
    boolean esTrabajoActual;
    String Fecha_de_Inicio;
    String Fecha_de_Finalizacion;
    String Descripcion;
    String Tipo_de_empleo;
}
