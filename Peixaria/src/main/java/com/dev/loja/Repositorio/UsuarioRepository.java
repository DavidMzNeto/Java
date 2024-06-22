package com.dev.loja.Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dev.loja.Usuario.Usuario;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findByEmail(String email);

    Optional<Usuario> findOne(long id);
}
