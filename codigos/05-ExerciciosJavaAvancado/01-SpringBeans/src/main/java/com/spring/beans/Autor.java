package com.spring.beans;

public class Autor implements AutorLivro {

    // Atributos
    private String nome;

    // Auxiliares
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodos
    public void exibirAutor() {
        System.out.println("Nome autor: " + this.getNome());
    }

}
