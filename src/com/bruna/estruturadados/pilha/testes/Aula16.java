package com.bruna.estruturadados.pilha.testes;

import com.bruna.estruturadados.pilha.Pilha;

public class Aula16 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>(10);

        System.out.println(pilha.verificaTopo());
        System.out.println(pilha);

        pilha.empilha(10);
        pilha.empilha(2);
        pilha.empilha(6);

        System.out.println(pilha);
        System.out.println("topo = " + pilha.verificaTopo());

    }
}
