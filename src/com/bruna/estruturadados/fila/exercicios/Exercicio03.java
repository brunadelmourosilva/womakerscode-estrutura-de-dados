package com.bruna.estruturadados.fila.exercicios;


/*
 * Utilize a classe fila para simular um sistema de senhas de um pronto socorro.
 * Cada pessoa pode ser classificda com 3 códigos: vermelho - de prioridade maior, amarelo - de prioridade media
 * e verde - quando a situação não é grave e a pessoa pode esperar mais tempo.
 * O programa deve obedecer as seguintes condições:
 * - Enfileire 6 pessoas na fila inicial;
 * - Pessoas com prioridade vermelha devem ser atendidas primeiro;
 * - Cada consulta dura cerca de 5 segundos, e depois o próximo da fila é chamado.
 * - A cada 4 segundos, uma pessoa chega no pronto socorro com prioridade aleatória
 *
 * Crie um código para criar aleatoriedade
 * */

import com.bruna.estruturadados.fila.FilaComPrioridade;

import java.util.PriorityQueue;
import java.util.Queue;

public class Exercicio03 {

    //prioridades
    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;

    public static void main(String[] args) {

        FilaComPrioridade<Pessoa> pessoas = new FilaComPrioridade<>();

        Queue<Pessoa> pessoas1 = new PriorityQueue<>();

        //6 pessoas na fila inicial
        pessoas.enfileira(new Pessoa("P1", VERDE));
        pessoas.enfileira(new Pessoa("P2", AMARELO));
        pessoas.enfileira(new Pessoa("P3", VERMELHO));
        pessoas.enfileira(new Pessoa("P4", VERDE));
        pessoas.enfileira(new Pessoa("P5", VERDE));
        pessoas.enfileira(new Pessoa("P6", VERMELHO));

        Atendimento atendimento = new Atendimento(pessoas);
        Atendimento pacientes = new Atendimento(pessoas);

        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(pacientes);

        t1.start();
        t2.start();
    }
}
