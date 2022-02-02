package com.bruna.estruturadados.pilha.exercicios;

/*
 * Escreve um programa que testa se uma sequência de caracteres fornecida pelo usuário é um palíndromo, ou seja,
 * é uma palavra cuja primeira metade é simétrica à segunda metade.
 * Veja alguns exemplos:
 *
 * - AABCCBAA - sim
 * - ADDFDDA - sim
 * - ABFFBB - não
 */

import java.util.Stack;

public class Exercicio05 {
    public static void main(String[] args) {

        imprimeResultado("ADA");

        imprimeResultado("ABCD");

        imprimeResultado("ABCCBA");

        imprimeResultado("Maria");

    }

    private static void imprimeResultado(String palavra) {
        System.out.println(palavra + " é palíndromo: " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra){
        Stack<Character> characters = new Stack<>();

        for (int i = 0; i < palavra.length(); i++) {
            characters.push(palavra.charAt(i)); //empilhando todos os caracteres
        }

        String palavraInversa = "";
        while (!characters.isEmpty()){
            palavraInversa += characters.pop(); //a String recebe a palavra desempilhada
        }

        if(palavraInversa.equalsIgnoreCase(palavra))
            return true;

        return false;
    }
}
