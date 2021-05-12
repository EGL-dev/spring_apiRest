package com.example.Api.Rest.services;

import com.example.Api.Rest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Api.Rest.models.usuarioModel;

import java.util.ArrayList;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<usuarioModel> obtenerUsuarios(){
       return (ArrayList<usuarioModel>) usuarioRepository.findAll();
    }

    public usuarioModel guardarUsuario(usuarioModel usuario){
        return usuarioRepository.save(usuario);
    }
}
