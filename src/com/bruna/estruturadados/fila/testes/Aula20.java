package com.bruna.estruturadados.fila.testes;

import com.bruna.estruturadados.fila.Fila;

public class Aula20 {
    public static void main(String[] args) {
        Fila<Character> fila = new Fila<>();

        fila.enfileira('A');
        fila.enfileira('B');
        fila.enfileira('C');

        System.out.println (fila.estaVazia());
        System.out.println(fila);
    }
}
