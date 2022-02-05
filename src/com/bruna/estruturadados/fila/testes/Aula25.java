package com.bruna.estruturadados.fila.testes;

import com.bruna.estruturadados.fila.Paciente;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {
    public static void main(String[] args) {


//        Queue<Integer> priorityQueue = new PriorityQueue<>();
//
//        priorityQueue.add(2);
//        priorityQueue.add(3);
//        priorityQueue.add(1);
//
//        for (Integer x : priorityQueue) {
//            System.out.println(x);
//        }

        //passando função de comparação ao invés de utilizar o compareTo na classe
        //classe anônima
        Queue<Paciente> priorityQueue = new PriorityQueue<>(
                new Comparator<Paciente>() {
                    @Override
                    public int compare(Paciente o1, Paciente o2) {
                        return Integer.valueOf(o1.getPrioridade()).compareTo(o2.getPrioridade());
                    }
                }
        );

        priorityQueue.add(new Paciente("Bruna", 2));
        priorityQueue.add(new Paciente("Alex", 1));
        priorityQueue.add(new Paciente("Vitória", 3));

        System.out.println(priorityQueue);
    }
}
