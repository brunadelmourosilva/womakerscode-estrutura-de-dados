package com.bruna.estruturadados.vetor.testes;

import com.bruna.estruturadados.vetor.Vetor;

public class Aula09 {

    public static void main(String[] args) {

        //debug
        Vetor vetor = new Vetor(2);

        vetor.adicionaElemento("A");
        vetor.adicionaElemento("B");
        vetor.adicionaElemento("C");
        vetor.adicionaElemento("D");

        System.out.println(vetor);
        System.out.println("--------------------");
        vetor.remove(1);
        System.out.println(vetor);
        System.out.println("--------------------");
        System.out.println("Remover elemento C por busca");

        int posicao = vetor.buscaElemento("C");

        if(posicao >= 0){
            vetor.remove(posicao);
        } else {
            System.out.println("O elemento não existe");
        }
        System.out.println(vetor);
    }
}
