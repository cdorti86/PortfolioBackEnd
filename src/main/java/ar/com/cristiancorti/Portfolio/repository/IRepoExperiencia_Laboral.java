/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.cristiancorti.Portfolio.repository;

import ar.com.cristiancorti.Portfolio.model.Experiencia_Laboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cdcorti
 */

@Repository
public interface IRepoExperiencia_Laboral extends JpaRepository <Experiencia_Laboral, Long>{
    
}
