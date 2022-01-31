package com.bruna.estruturadados.vetor.testes;

import com.bruna.estruturadados.vetor.Vetor;

public class Aula05 {

    public static void main(String[] args) {

        //debug
        Vetor vetor = new Vetor(10);

        vetor.adicionaElemento("1");
        vetor.adicionaElemento("2");
        vetor.adicionaElemento("3");

        //System.out.println(vetor.buscaElemento(-1));
        System.out.println("------------------");
        System.out.println(vetor.buscaElemento(2));

    }
}
