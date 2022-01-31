package com.bruna.estruturadados.vetor.testes;

import com.bruna.estruturadados.vetor.Vetor;

public class Aula06 {

    public static void main(String[] args) {

        //debug
        Vetor vetor = new Vetor(10);

        vetor.adicionaElemento("1");
        vetor.adicionaElemento("2");
        vetor.adicionaElemento("3");

        System.out.println("posição " + vetor.buscaElemento("1"));

    }
}
