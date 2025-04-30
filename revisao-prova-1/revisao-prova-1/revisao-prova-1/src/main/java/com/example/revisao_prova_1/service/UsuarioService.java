package com.example.revisao_prova_1.service;

import com.example.revisao_prova_1.model.Usuario;
import com.example.revisao_prova_1.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario postUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public ResponseEntity<Usuario> putUsuario(Integer id, Usuario usuario) {
        usuarioRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado"));

        usuario.setId(id);
        usuarioRepository.save(usuario);
        return ResponseEntity.ok(usuario);
    }

    public ResponseEntity<Void> deleteUsuario(Integer id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado"));

        usuarioRepository.delete(usuario);
        return ResponseEntity.noContent().build();
    }

    public Optional<Usuario> getUsuarioByNomeAndCidade(String nome, String cidade) {
        return usuarioRepository.findByNomeAndCidade(nome, cidade);
    }
}
