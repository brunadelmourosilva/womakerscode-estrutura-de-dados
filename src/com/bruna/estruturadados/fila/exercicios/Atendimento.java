package com.bruna.estruturadados.fila.exercicios;

import com.bruna.estruturadados.fila.FilaComPrioridade;

import java.util.PriorityQueue;

public class Atendimento implements Runnable{

    private FilaComPrioridade<Pessoa> pessoas;

    public Atendimento(FilaComPrioridade<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public void run() {

        //desenfileira os pacientes com 5 segundos
        while (!pessoas.estaVazia()) {
            try {
                System.out.println(pessoas.desenfileira() + " atendida.");

                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Atendimento concluído.");

    }

}
