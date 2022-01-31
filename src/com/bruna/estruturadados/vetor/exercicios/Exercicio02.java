package com.bruna.estruturadados.vetor.exercicios;

import com.bruna.estruturadados.vetor.ListaGenerica;

/*
 * Melhore a classe Lista e implemente o método ultimoIndice, semelhante ao método lastIndexOf da classe ArrayList.
 */

public class Exercicio02 {

    public static void main(String[] args) {

        ListaGenerica<String> letras = new ListaGenerica<>(3);

        letras.adicionaElemento("A");
        letras.adicionaElemento("B");
        letras.adicionaElemento("A");
        letras.adicionaElemento("C");

        System.out.println(letras.ultimoIndice("C"));
        System.out.println(letras.ultimoIndice("R"));
        System.out.println(letras.ultimoIndice("H"));
        System.out.println(letras.ultimoIndice("A"));
    }
}
