package com.bruna.estruturadados.pilha.testes;

import com.bruna.estruturadados.pilha.Pilha;

public class Aula14 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>(10);

        for (int i = 0; i < 10; i++) {
            pilha.empilha(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanhoVetor());
    }
}
