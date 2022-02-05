package com.bruna.estruturadados.fila.exercicios.classes;

import com.bruna.estruturadados.fila.FilaComPrioridade;

import java.util.PriorityQueue;

public class Atendimento implements Runnable{

    private PriorityQueue<Pessoa> pessoas;

    public Atendimento(PriorityQueue<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public void run() {

        //desenfileira os pacientes com 5 segundos
        while (!pessoas.isEmpty()) {
            try {
                System.out.println(pessoas.poll() + " atendida.");

                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Atendimento concluído!");

    }

}
