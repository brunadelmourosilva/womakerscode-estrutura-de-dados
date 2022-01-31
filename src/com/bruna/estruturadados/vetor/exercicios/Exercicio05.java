package com.bruna.estruturadados.vetor.exercicios;

import com.bruna.estruturadados.vetor.ListaGenerica;

import java.util.List;

public class Exercicio05 {

    public static void main(String[] args) {

        ListaGenerica<String> letras = new ListaGenerica<>(4);

        letras.adicionaElemento("A");
        letras.adicionaElemento("B");
        letras.adicionaElemento("C");
        letras.adicionaElemento("D");

        System.out.println(letras);
        System.out.println("--------------------");
        letras.limpar();
        System.out.println(letras);


    }
}
