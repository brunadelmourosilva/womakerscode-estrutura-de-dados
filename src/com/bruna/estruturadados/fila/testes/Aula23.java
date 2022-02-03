package com.bruna.estruturadados.fila.testes;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {
    public static void main(String[] args) {

        //Queue é uma interface
        //LinkedList: lista encadeada(representando uma fila)
        Queue<Integer> fila = new LinkedList<>();

        fila.add(1); //enqueue
        fila.add(2); //enqueue
        fila.add(3); //enqueue

        System.out.println(fila);

        System.out.println(fila.peek()); //espiar

        System.out.println(fila.remove()); //remove a primeira posição

        System.out.println(fila);
    }
}
