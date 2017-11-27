/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.spring.data.repository;

import com.cice.spring.data.entity.UsuarioEntity;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cice
 */
@Repository
public interface IUsuarioRepository extends JpaRepository<UsuarioEntity,Serializable>{
        
    
}
