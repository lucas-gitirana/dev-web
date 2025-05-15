package com.api_rest.demo.model;

public class Projeto {
    Integer id;
    String titulo;
    String coordenador;

    public Projeto() {
    }

    public Projeto(Integer id, String titulo, String coordenador) {
        this.id = id;
        this.titulo = titulo;
        this.coordenador = coordenador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", coordenador='" + coordenador + '\'' +
                '}';
    }
}
