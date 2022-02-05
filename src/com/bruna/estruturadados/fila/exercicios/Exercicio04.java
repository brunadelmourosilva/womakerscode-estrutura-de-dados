package com.bruna.estruturadados.fila.exercicios;

/*
 * Escreva um programa usando filas que simule a brincadeira da "Batata
 * Quente". A brincadeira consiste de um grupo de crianças que fica em
 * círculo, sentado ou em pé.
 * Uma criança fora da roda, de costas ou com os olhos vendados, dizendo a frase:
 * "Batata quente, quente, quente...queimou!"
 * Enquanto isso, os demais vão passando a bola de mão em mão até ouvirem a palavra "queimou".
 * Quem estiver com a bola nesse momento sai da roda.
 * Ganha o último que sobrar.
 * */

/* Lógica:
   0 1 2 3 4 5 6 7 8 9
   número aleatório = 2

   -> 0 1 2
   -> 2 eliminado
   3 4 5 6 7 8 9 0 1

   -> 3 4 5
   -> 5 eliminado
   6 7 8 9 0 1 3 4

   -> 6 7 8
   -> 8 eliminado
   9 0 1  3 4 6 7

   -> 9 0 1
   -> 1 eliminado
   3 4  6 7 9 0

   -> 3 4 6
   -> 6 eliminado
   7 9 0 3 4

   -> 7 9 0
   -> 0 eliminado
   3 4 7 9

   -> 3 4 7
   -> 7 eliminado
   9 3 4

   -> 9 3 4
   -> 4 eliminado
   9 3

   -> 9 3
   -> 3 eliminado
   3 9
   Ganhador: 3

* */

import com.bruna.estruturadados.fila.Fila;

import java.util.Random;

public class Exercicio04 {
    public static void main(String[] args) {

        Fila<Integer> criancas = new Fila<>();

        for (int i = 0; i < 10; i++) {
            criancas.enfileira(i);
        }

        Random numAleatorio = new Random();
        int num = 0;

        //gera um número aleatório - limitador da fila
        while (num == 0) {
            num = numAleatorio.nextInt(10);
        }

        System.out.println("Número = " + num);

        //sobrar uma pessoa na fila
        while (criancas.tamanhoVetor() > 1) {
            for (int i = 0; i < num; i++) {
                //ideia de fila circular
                //remove a pessoa do início da fila e volta para o final
                criancas.enfileira(criancas.desenfileira());
            }
            //remove uma pessoa
            System.out.println("Eliminado = " + criancas.desenfileira());
        }

        System.out.println("Ganhador: " + criancas.desenfileira());
    }
}
