package com.bruna.estruturadados.pilha.exercicios;

/*
* Usando a classe Pilha ou Stack, desenvolva um algorítmo que faça a conversão de números
* decimais para binário.
* */

import java.util.Stack;

public class Exercicio07 {
    public static void main(String[] args) {
        imprimeResultado(2);

        imprimeResultado(4);

        imprimeResultado(10);

        imprimeResultado(100);

        imprimeResultado(10035);

        imprimeResultado(12000);

        imprimeResultadoQualquerBase(25, 16);

        imprimeResultadoQualquerBase(10035, 8);

        imprimeResultadoQualquerBase(100, 16);
    }

    public static void imprimeResultado(int numero){
        System.out.println(numero + " em binário é: " + decimalBinario(numero));
    }


    public static void imprimeResultadoQualquerBase(int numero, int base){
        System.out.println(numero + " na base " + base + " é: " + decimalQualquerBase(numero, base));
    }

    public static String decimalBinario(int numero){

        Stack<Integer> pilha = new Stack<>();
        String numBinario = "";
        int resto;

        while (numero > 0){
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2; //divide o número por 2
        }

        //desempilha o número binário
        while (!pilha.isEmpty()){
            numBinario += pilha.pop();
        }

        return numBinario;
    }

    public static String decimalQualquerBase(int numero, int base){

        //validação de entrada
        if (base > 16){
            throw new IllegalArgumentException();
        }

        Stack<Integer> pilha = new Stack<>();
        String numBase = "";
        int resto;
        String bases = "0123456789ABCDEF";

        while (numero > 0){
            resto = numero % base;
            pilha.push(resto);
            numero /= base;
        }

        while (!pilha.isEmpty()){
            numBase += bases.charAt(pilha.pop()); //caracter no número correspondente
        }

        return numBase;
    }
}
