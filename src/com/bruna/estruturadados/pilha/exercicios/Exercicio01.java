package com.bruna.estruturadados.pilha.exercicios;

/*
 * Escreva um programa que leia 10 números.
 * Para cada número lido, verifique e codifique de acordo com as regras a seguir:
 * - Se o número for par, empilhe na pilha;
 * - Se o número for ímpar, desempilhe um número da pilha.
 * Caso a pilha esteja vazia, mostre uma mensagem
 * - Se ao final do programa a pilha não estiver vazia,
 * desempilhe todos os elementos, imprimindo-os na tela
 */


import com.bruna.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Pilha<Integer> numeros = new Pilha<>(10);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Número: ");
            Integer num = sc.nextInt();

            //se o número for par
            if(num % 2 == 0) {
                System.out.println("Empilhou!");
                numeros.empilha(num);
            }

            //se o número for ímpar
            if(!(num % 2 == 0)) {
                Integer des = numeros.desempilha();

                if(des == null)
                    System.out.println("Pilha vazia");
                else
                    System.out.println("Desempilhou = " + des);
            }
        }

        System.out.println("---------------------------------------------");

            if(numeros.estaVazia()) {
                System.out.println("Pilha vazia");
            } else {
                for (int i = 0; i < numeros.tamanhoVetor(); i++) {
                    System.out.println("Desempilhou = " + numeros.desempilha());
                }
            }

        }

    }

