package com.bruna.estruturadados.vetor.exercicios;

import com.bruna.estruturadados.vetor.ListaGenerica;

/*
 * Melhore a classe Lista e implemente o método obtem(int posicao),onde sera possível obter o elemento dado uma
 * posição do vetor.
 * Esse método é semelhante ao método get(int posicao) da classe ArrayList.
 */

public class Exercicio04 {

    public static void main(String[] args) {

        ListaGenerica<String> letras = new ListaGenerica<>(4);

        letras.adicionaElemento("A");
        letras.adicionaElemento("B");
        letras.adicionaElemento("C");
        letras.adicionaElemento("D");

        System.out.println(letras.obtem(1));
        System.out.println("--------------------");
        System.out.println(letras.obtem(5));

    }
}
