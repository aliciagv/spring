/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.spring.service;

import com.cice.spring.data.entity.UsuarioEntity;
import java.util.List;

/**
 *
 * @author cice
 */
public interface IUsuarioService {
    
    List<UsuarioEntity> findAllUsuarios();
    
    UsuarioEntity almacenaUsuario(UsuarioEntity usuario);
    
}
