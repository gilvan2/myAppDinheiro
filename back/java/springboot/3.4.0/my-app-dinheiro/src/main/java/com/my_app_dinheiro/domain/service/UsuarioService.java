package com.my_app_dinheiro.domain.service;

import com.my_app_dinheiro.domain.entity.Usuario;
import com.my_app_dinheiro.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Optional<Usuario> findById(Long id){
        return usuarioRepository.findById(id);
    }
}
