package com.bruna.estruturadados.vetor.testes;

import com.bruna.estruturadados.vetor.Vetor;

public class Aula08 {

    public static void main(String[] args) {

        //debug
        Vetor vetor = new Vetor(2);

        vetor.adicionaElemento("A");
        vetor.adicionaElemento("B");
        vetor.adicionaElemento("C"); //+
        vetor.adicionaElemento("D"); //+

        System.out.println(vetor);
    }
}
