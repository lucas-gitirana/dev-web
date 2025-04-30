package com.example.revisao_prova_1.repository;

import com.example.revisao_prova_1.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByNomeAndCidade(String nome, String cidade);
}
