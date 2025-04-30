package com.example.revisao_prova_1.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private LocalDate dataNascimento;
    private String cidade;
    private String ocupacao;
    private String interesse;

    public Usuario() {
    }

    public Usuario(Integer id, String nome, String descricao, LocalDate dataNascimento, String cidade, String ocupacao, String interesse) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataNascimento = dataNascimento;
        this.cidade = cidade;
        this.ocupacao = ocupacao;
        this.interesse = interesse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public String getInteresse() {
        return interesse;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", cidade='" + cidade + '\'' +
                ", ocupacao='" + ocupacao + '\'' +
                ", interesse='" + interesse + '\'' +
                '}';
    }
}
