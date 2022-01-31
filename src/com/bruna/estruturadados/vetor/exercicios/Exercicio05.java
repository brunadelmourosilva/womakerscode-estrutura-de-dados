package com.bruna.estruturadados.vetor.exercicios;

import com.bruna.estruturadados.vetor.ListaGenerica;

/*
 * Melhore a classe Lista e implemente o método limpar, onde todos os elementos da lista são removidos.
 * Esse método é semelhante ao método clear da classe ArrayList.
 */

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
