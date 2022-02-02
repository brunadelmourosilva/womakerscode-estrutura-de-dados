package com.bruna.estruturadados.pilha.exercicios;

/*
 * Escreva um programa que leia 10 números.
 * Para cada número lido, verifique e codifique de acordo com as regras a seguir:
 * - Se o número for par, empilhe na chamada par;
 *
 * - Se o número for ímpar, empilhe na chamada impar;
 *
 * - Se o número for zero (0), desempilhe um elemento de cada pilha.
 *
 * Caso alguma pilha esteja vazia, mostre uma mensagem de erro na tela.
 *
 * Ao final do programa desempilhe todos os elementos das duas pilhas, imprimindo-os na tela
 */


import com.bruna.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Pilha<Integer> numerosPares = new Pilha<>(10);
        Pilha<Integer> numerosImpares = new Pilha<>(10);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Número: ");
            Integer num = sc.nextInt();

            //se o número for par
            if ((num % 2 == 0) && (num != 0)) {
                System.out.println("Empilhou um número par!");
                numerosPares.empilha(num);
            }

            //se o número for ímpar
            if ((!(num % 2 == 0))) {
                System.out.println("Empilhou um número ímpar!");
                numerosImpares.empilha(num);
            }

            if (num == 0) {
                Integer par = numerosPares.desempilha();
                if (par == null) {
                    System.out.println("Pilha par vazia");
                } else {
                    System.out.println("Pilha de números pares -> desempilhando " + par);
                }

                Integer impar = numerosImpares.desempilha();
                if (impar == null) {
                    System.out.println("Pilha ímpar vazia");
                } else {
                    System.out.println("Pilha de números ímpares -> desempilhando " + impar);
                }
            }
        }

        System.out.println("---------------------------------------------");

        if (numerosPares.estaVazia()) {
            System.out.println("Pilha par vazia!");
        } else {
            System.out.println("Pilha de números pares desempilhados: ");

            for (int i = 0; i < numerosPares.tamanhoVetor(); i++) {
                System.out.println("Desempilhou = " + numerosPares.desempilha());
            }
        }

        if (numerosImpares.estaVazia()) {
            System.out.println("Pilha ímpar vazia!");
        } else {
            System.out.println("Pilha de números ímpares desempilhados: ");

            for (int i = 0; i < numerosImpares.tamanhoVetor(); i++) {
                System.out.println("Desempilhou = " + numerosImpares.desempilha());
            }
        }
    }

}


