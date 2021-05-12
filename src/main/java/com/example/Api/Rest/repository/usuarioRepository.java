package com.example.Api.Rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuarioRepository extends CrudRepository<usuarioModel, long > {

}
