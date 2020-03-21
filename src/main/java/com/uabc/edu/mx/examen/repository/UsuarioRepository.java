package com.uabc.edu.mx.examen.repository;

import com.uabc.edu.mx.examen.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long> {
}
