package com.bruna.estruturadados.pilha.exercicios;

/* Usando a classe Pilha ou Stack, desenvolva um algorítmo que resolva o quebra cabeça Torre de Hanoi.
 * */

import java.util.Stack;

public class Exercicio08 {

    public static void main(String[] args) {
        Stack<Integer> torre1 = new Stack<>(); //original
        Stack<Integer> torre2 = new Stack<>(); //destino
        Stack<Integer> torre3 = new Stack<>(); //auxiliar

        //empilhar elementos
        torre1.push(3);
        torre1.push(2);
        torre1.push(1);

        torreHanoi(torre1.size(), torre1, torre2, torre3);

    }

    public static void torreHanoi(int numDiscos, Stack<Integer> original,
                                  Stack<Integer> destino,
                                  Stack<Integer> auxiliar) {

        //caso base - condição de parada
        if(numDiscos > 0){
            //transformando torre de destino em torre auxiliar
            torreHanoi(numDiscos - 1, original, auxiliar, destino);

            //desempilha um disco da pilha original e destino empilha o disco
            destino.push(original.pop());
            System.out.println("------");

            System.out.println("Original: " + original);
            System.out.println("Destino: " + destino);
            System.out.println("Aux: " + auxiliar);

            //transformando torre auxiliar em torre original
            torreHanoi(numDiscos - 1, auxiliar, destino, original);
        }
    }
}
