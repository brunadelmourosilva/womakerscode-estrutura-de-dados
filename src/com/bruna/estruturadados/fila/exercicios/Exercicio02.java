package com.bruna.estruturadados.fila.exercicios;


/*
 * Escreva um programa que simule a distribuição de senhas de atendimento
 * a um grupo de pessoas. Cada pessoa pode receber uma senha prioritária ou uma senha normal.
 * O programa deve obedecer os seguintes critérios:
 * - Existe apenas 1 atendente;
 * - 1 pessoa com senha normal deve ser atendida a cada 3 pessoas com senha prioritária;
 * - Não havendo prioridades, as pessoas com senha normal podem ser atendidas.
 * */

import com.bruna.estruturadados.fila.Fila;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Exercicio02 {

    public static final String PESSOA_NORMAL = "NORMAL";
    public static final String PESSOA_PRIORITARIA = "PRIORITÁRIA";

    public static void main(String[] args) {

        final int MAX = 3;

        //fila normal
        Fila<String> senhaNormal = new Fila<>();
        //fila de prioridade
        Fila<String> senhaPrioritaria = new Fila<>();

        senhaPrioritaria.enfileira("Bruna");
        senhaPrioritaria.enfileira("Alex");
        senhaPrioritaria.enfileira("Vitória");

        senhaNormal.enfileira("Isabela");
        senhaNormal.enfileira("Mari");
        senhaNormal.enfileira("Hellen");
        senhaNormal.enfileira("Amanda");

        senhaPrioritaria.enfileira("Raquel");
        senhaPrioritaria.enfileira("Marcir");
        senhaPrioritaria.enfileira("Zé");

        senhaNormal.enfileira("Gi");
        senhaNormal.enfileira("Sara");
        senhaNormal.enfileira("Laura");



        while (!senhaNormal.estaVazia() || !senhaPrioritaria.estaVazia()) {
            int cont = 0;
            //pessoa prioritária a ser atentida
            while (!senhaPrioritaria.estaVazia() && cont < MAX) {
                atendimento(senhaPrioritaria, PESSOA_PRIORITARIA);

                cont++;
            }

            //uma pessoa da fila normal a ser atendida
            if(!senhaNormal.estaVazia()){
                atendimento(senhaNormal, PESSOA_NORMAL);
            }

            //se a fila prioritária está vazia, todos da fila normal serão atendidos
            if(senhaPrioritaria.estaVazia()){
                while (!senhaNormal.estaVazia()){
                    atendimento(senhaNormal, PESSOA_NORMAL);

                }
            }
        }

    }

    public static void atendimento(Fila<String> tipoFila, String tipo) {
        String pessoaAtendida = tipoFila.desenfileira();

        System.out.println("PESSOA " + tipo);
        System.out.println(pessoaAtendida + " foi atendido(a).");
        System.out.println("----------------------------------");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
