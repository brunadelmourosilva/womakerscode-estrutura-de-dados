package com.bruna.estruturadados.fila.exercicios.classes;

public class Documento {

    private String nome;
    private Integer qtdFolhas;

    public Documento(String nome, Integer qtdFolhas) {
        this.nome = nome;
        this.qtdFolhas = qtdFolhas;
    }

    public Documento() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdFolhas() {
        return qtdFolhas;
    }

    public void setQtdFolhas(Integer qtdFolhas) {
        this.qtdFolhas = qtdFolhas;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nome='" + nome + '\'' +
                ", qtdFolhas=" + qtdFolhas +
                '}';
    }
}
