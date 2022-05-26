package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro {

    // Atributos
    private int codigo;
    private String nome;

    @Autowired // Diz pro spring que se trata de uma injeção de dependencia
    private AutorLivro autorLivro;

    // Auxiliares
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public AutorLivro getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(AutorLivro autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodos
    public void exibir() {
        System.out.println("Codigo: " + this.getCodigo() + "\nNome Livro: " + this.getNome());
        this.autorLivro.exibirAutor();
    }

}
