package com.bruna.estruturadados.fila.exercicios;


/*
 * Escreva um programa que simule a distribuição de senhas de atendimento
 * a um grupo de pessoas. Cada pessoa pode receber uma senha prioritária ou uma senha normal.
 * O programa deve obedecer os seguintes critérios:
 * - Existe apenas 1 atendente;
 * - 1 pessoa com senha normal deve ser atendida a cada 3 pessoas com senha prioritária;
 * - Não havendo prioridades, as pessoas com senha normal podem ser atendidas.
 * */

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Exercicio02 {

    public static void main(String[] args) {

        //comparar o primeiro caracter - 1 ou 2
        //atender de acordo com esse critério

        //CONTINUAR EXERCICIO E RESOLVER PROBLEMA DE COMPILAÇÃO
        Queue<Pessoa> filaSenhas = new PriorityQueue(
                new Comparator() {

                    @Override
                    public int compare(Pessoa o1, Pessoa o2) {
                        return Integer.valueOf(Integer.parseInt(o1.getSenha().substring(0)))
                                .compareTo(Integer.parseInt(o2.getSenha().substring(0)));
                    }
                }
        );

        //SENHA: 1SP - senha prioritária
        //SENHA: 2NP - senha não prioritária

        filaSenhas.add(new Pessoa("Bruna", "1SP1234"));
        filaSenhas.add(new Pessoa("Alex", "1SP1200"));
        filaSenhas.add(new Pessoa("Isabela", "2NP1345"));
        filaSenhas.add(new Pessoa("Vitória", "1SP1234"));
        filaSenhas.add(new Pessoa("Mari", "2NP1234"));
        filaSenhas.add(new Pessoa("Hellen", "2NP15675"));
        filaSenhas.add(new Pessoa("Amanda", "2NP8987"));


        int max = 3;
        while (!filaSenhas.isEmpty()){
            Pessoa pessoaAtendida = filaSenhas.poll();

            System.out.println("Pessoa prioritária atendida: " + pessoaAtendida.getNome());
            max--;

            if(max == 0){
                System.out.println("Pessoa não prioritária atendida: " + pessoaAtendida.getNome());
            }
        }
    }
}
