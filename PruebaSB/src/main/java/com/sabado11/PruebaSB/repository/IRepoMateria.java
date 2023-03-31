/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sabado11.PruebaSB.repository;

import com.sabado11.PruebaSB.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cdcorti
 */

@Repository
public interface IRepoMateria extends JpaRepository <Materia, Long> {
    
}
