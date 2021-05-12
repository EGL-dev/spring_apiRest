package com.example.Api.Rest.controller;

import com.example.Api.Rest.models.usuarioModel;
import com.example.Api.Rest.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;

@RestController
@RequestMapping("/usuarios")
public class usuarioController {
    @Autowired
    UsuarioService usuarioService;

     @GetMapping()
    public ArrayList<usuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();

     }

     @PostMapping()
    public usuarioModel guardarUsuarios(@RequestBody usuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
     }
}
