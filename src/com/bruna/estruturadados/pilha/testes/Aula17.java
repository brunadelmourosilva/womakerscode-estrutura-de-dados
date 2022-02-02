package com.bruna.estruturadados.pilha.testes;

import com.bruna.estruturadados.pilha.Pilha;

public class Aula17 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>(10);

        pilha.empilha(10);
        pilha.empilha(2);
        pilha.empilha(6);

        System.out.println(pilha);

        System.out.println("Elemento desempilhado = " + pilha.desempilha());

        System.out.println(pilha);
    }
}
