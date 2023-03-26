/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.SpringBoot_V11.repository;

import com.ejemplo.SpringBoot_V11.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cdcorti
 */
@Repository

public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
    
}
