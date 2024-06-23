package com.dev.Peixaria.Controle.Usuario.Controle;   

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev.Peixaria.Controle.Usuario.Repository.UsuarioRepository;


@RestController
@RequestMapping("loja/usuarios")
public class UsuarioController {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @DeleteMapping("/{id}")
    public void removerProduto(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }

}
