/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.spring.service.impl;

import com.cice.spring.data.entity.UsuarioEntity;
import com.cice.spring.data.repository.IUsuarioRepository;
import com.cice.spring.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cice
 */
@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private IUsuarioRepository usuarioRepository;
     
    @Override
    public List<UsuarioEntity> findAllUsuarios() {
        
        return usuarioRepository.findAll();
    }

    @Override
    public UsuarioEntity almacenaUsuario(UsuarioEntity usuario) {
        
        usuarioRepository.save(usuario);
        return usuario;
       
    }
    
}
