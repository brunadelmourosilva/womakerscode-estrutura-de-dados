package com.bruna.estruturadados.pilha.exercicios;

//exercício refatorado com exercício proposto em C, na faculdade
/*
 * Escreva um programa para verificar se uma expressão
 * matemática tem os parenteses agrupados de forma correta,
 * isto é:
 *
 * (1) se o número de parêntese à esquerda e à direita são iguais e:
 * (2) se todo parênteses aberto é seguido posteriormente por um fechamento
 * fechamento de parêntese.
 *
 * Veja alguns exemplos:
 *- As expressões ((A+B) ou A+B (violam a condição 1
 *- As expressões ) A+B(-C OU(A+B))-(C+D violam a condição 2
 *- A expressão ((A+B)+D) está ok
 */

import com.bruna.estruturadados.pilha.Pilha;

public class Exercicio06 {

    public static void main(String[] args) {

        char aux2;

        Pilha<Character> pilha = new Pilha<>();

        String expressao = "{[()]}[](){()}";

        for (int i = 0; i < expressao.length(); i++) {

            switch (expressao.charAt(i)) {

                //Caso abra parênteses, colchetes ou chaves.
                case '(':
                    pilha.empilha('(');
                    break;

                case '[':
                    pilha.empilha('[');
                    break;

                case '{':
                    pilha.empilha('{');
                    break;

                //Caso feche parênteses, colchetes ou chaves.
                case ']':
                    if (pilha.tamanhoVetor() == 0 || pilha.verificaTopo() != '[') {
                        System.out.println("Problema com ']'\n");
                    } else if (pilha.verificaTopo() == '[') { //verifica se o topo da pilha é [
                        pilha.desempilha();
                    }
                    break;

                case ')':
                    if (pilha.tamanhoVetor() == 0 || pilha.verificaTopo() != '(') {
                        System.out.println("Problema com ')'\n");
                    } else if (pilha.verificaTopo() == '(') { //verifica se o topo da pilha é (
                        pilha.desempilha();
                    }
                    break;

                case '}':
                    if (pilha.tamanhoVetor() == 0 || pilha.verificaTopo() != '{') {
                        System.out.println("Problema com '}'\n");
                    } else if (pilha.verificaTopo() == '{') { //verifica se o topo da pilha é {
                        pilha.desempilha();
                    }
                    break;
            }
        }

        //Se sobrou algo na pilha no final da entrada, então algo deixou de ser fechado.
        if (pilha.tamanhoVetor() != 0) {
            aux2 = pilha.verificaTopo();
            pilha.desempilha();

            System.out.printf("Sobrou um '%c'\n", aux2);
        } else {
            System.out.println("tudo ok\n");
        }
    }

}
