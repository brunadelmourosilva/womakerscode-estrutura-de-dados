package com.bruna.estruturadados.fila.exercicios.classes;

import com.bruna.estruturadados.fila.FilaComPrioridade;

import java.util.PriorityQueue;
import java.util.Random;

public class NovosPacientes implements Runnable {

    private PriorityQueue<Pessoa> fila;
    private int cont = 7;
    private Random prioridade = new Random();

    public NovosPacientes(PriorityQueue<Pessoa> fila) {
        super();
        this.fila = fila;
    }

    @Override
    public void run() {

        //limite de 8 pessoas
        for (int i = 0; i < 8; i++) {
            try {
                Thread.sleep(8000);
                Pessoa p = new Pessoa("PX" + cont, prioridade.nextInt(3)); //prioridade aleatória

                fila.add(p);
                cont++;

                System.out.println(p + " enfileirada.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
