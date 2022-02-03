package com.bruna.estruturadados.fila.testes;

import com.bruna.estruturadados.fila.Fila;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula19 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.estaVazia());

        System.out.println(fila.tamanhoVetor());
    }
}
