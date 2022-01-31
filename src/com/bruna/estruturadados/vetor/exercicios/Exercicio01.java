package com.bruna.estruturadados.vetor.exercicios;

import com.bruna.estruturadados.vetor.ListaGenerica;

/*
 * Melhore a classe Lista e implemente o método contém, semelhando ao método contains da classe ArrayList.
 */

public class Exercicio01 {

    public static void main(String[] args) {
        ListaGenerica<Integer> numeros = new ListaGenerica<Integer>(3);

        numeros.adicionaElemento(1);
        numeros.adicionaElemento(2);
        numeros.adicionaElemento(3);

        if(numeros.contem(4))
            System.out.println("O elemento existe");
        else
            System.out.println("O elemento não existe");
    }


}
