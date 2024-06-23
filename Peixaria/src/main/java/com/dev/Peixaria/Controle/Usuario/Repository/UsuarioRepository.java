package com.dev.Peixaria.Controle.Usuario.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dev.Peixaria.Controle.Usuario.Usuario;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findByEmail(String email);

    Optional<Usuario> findById(Long id);
}
