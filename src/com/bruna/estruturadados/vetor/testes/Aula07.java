package com.bruna.estruturadados.vetor.testes;

import com.bruna.estruturadados.vetor.Vetor;

public class Aula07 {

    public static void main(String[] args) {

        //debug
        Vetor vetor = new Vetor(5);

        vetor.adicionaElemento("A");
        vetor.adicionaElemento("B");
        vetor.adicionaElemento("C");
        vetor.adicionaElemento("D");

        System.out.println(vetor);
        System.out.println("-------------------------------------------");
        vetor.adicionaElemento(2, "x");
        System.out.println(vetor);
    }
}
