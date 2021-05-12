package com.example.Api.Rest.repository;

import com.example.Api.Rest.models.usuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<usuarioModel, Long > {

}
