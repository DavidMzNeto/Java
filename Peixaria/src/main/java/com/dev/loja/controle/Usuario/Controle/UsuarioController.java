package com.dev.loja.controle.Usuario.Controle;   

import com.dev.loja.controle.Usuario.Repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
