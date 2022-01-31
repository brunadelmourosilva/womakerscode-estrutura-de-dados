package com.bruna.estruturadados.vetor.exercicios;

import com.bruna.estruturadados.vetor.ListaGenerica;

/*
 * Melhore a classe Lista e implemente o método remove(T elemento),onde sera possível remover um elemento da lista
 * passando o mesmo como parâmetro.
 */

public class Exercicio03 {

    public static void main(String[] args) {

        ListaGenerica<String> letras = new ListaGenerica<>(4);

        letras.adicionaElemento("A");
        letras.adicionaElemento("B");
        letras.adicionaElemento("C");
        letras.adicionaElemento("D");

        letras.remove("C");
        System.out.println(letras);


    }
}
