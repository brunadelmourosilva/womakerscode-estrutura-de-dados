package com.bruna.estruturadados.pilha.testes;

import com.bruna.estruturadados.pilha.Pilha;

public class Aula13 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>(10);

        //debug
        System.out.println(pilha);
        System.out.println(pilha.tamanhoVetor());
    }
}
