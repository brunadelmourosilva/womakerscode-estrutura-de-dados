package com.bruna.estruturadados.fila.exercicios;

/*
 * Escreva um programa usando filas que simule a brincadeira da "Batata
 * Quente". A brincadeira consiste de um grupo de crianças que fica em
 * circulo, sentado ou em pé.
 * Uma criança fora da roda, de costas ou com os olhos vendados, dizendo a frase:
 * "Batata quente, quente, quente...queimou!"
 * Enquanto isso, os demais vão passando a bola de mão em mão até ouvirem a palavra "queimou".
 * Quem estiver com a bola nesse momento sai da roda.
 * Ganha o ultimo que sobrar.
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

        //gera um número aleatório
        while (num == 0) {
            num = numAleatorio.nextInt(10);
        }

        System.out.println("Número = " + num);

        while (criancas.tamanhoVetor() > 1) {
            for (int i = 0; i < num; i++) {
                criancas.enfileira(criancas.desenfileira());
            }
            System.out.println("Eliminado = " + criancas.desenfileira());
        }

        System.out.println("Ganhador: " + criancas.desenfileira());
    }
}
