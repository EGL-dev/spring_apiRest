package com.example.Api.Rest.controller;

import com.example.Api.Rest.models.usuarioModel;
import com.example.Api.Rest.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Optional;

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

     @GetMapping(path= "/{id}")
     public Optional<usuarioModel> obternerporId(@PathVariable("id") Long id){
         return this.usuarioService.obternerporId(id);

     }
     @GetMapping(path = "/query")
    public ArrayList<usuarioModel>obtenerporPrioridad(@RequestParam("prioridades")Integer prioridad){
         return this.usuarioService.obtenerporPrioridad(prioridad);
     }

     @DeleteMapping(path = "/{id}")

    public String eliminarporId(@PathVariable("id")Long id){
         boolean ok = this.usuarioService.eliminarUsuario(id);
         if(ok){
             return "Se elimino el usuario con el id" + id;
         }else{
             return "No pudo eliminar el usuario con id" + id;
         }
     }

}
