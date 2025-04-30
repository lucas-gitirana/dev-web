package com.example.revisao_prova_1.controller;

import com.example.revisao_prova_1.model.Usuario;
import com.example.revisao_prova_1.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioService.getUsuarios();
    }

    @GetMapping("/usuarios-complex")
    public Optional<Usuario> getUsuarios(
            @RequestParam(required = false, defaultValue = "") String nome,
            @RequestParam(required = false, defaultValue = "") String cidade
    ) {
        return usuarioService.getUsuarioByNomeAndCidade(nome, cidade);
    }

    @PostMapping("/usuarios")
    public Usuario postUsuario(@RequestBody Usuario usuario) {
        return usuarioService.postUsuario(usuario);
    }

    @PutMapping("/usuarios/{id}")
    public ResponseEntity<Usuario> postUsuario(@PathVariable Integer id, @RequestBody Usuario usuario) {
        return usuarioService.putUsuario(id, usuario);
    }

    @DeleteMapping("/usuarios/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Integer id) {
        return usuarioService.deleteUsuario(id);
    }

}
