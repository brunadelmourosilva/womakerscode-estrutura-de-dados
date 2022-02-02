package com.bruna.estruturadados.pilha.exercicios;

/*
 * Repita o mesmo processo do exercício anterior, porém utilizando a classe Stack Java.
 *
 */


import com.bruna.estruturadados.pilha.Pilha;

import java.util.LinkedList;
import java.util.Stack;

public class Exercicio04 {

    public static void main(String[] args) {

        Stack<Livro> pilhaLivrosLivroStack = new Stack<>(); //utiliza a classe LinkedList(lista encadeada dinâmica)

        Livro livro1 = new Livro();
        livro1.setNome("Learning JavaScript Data Structures and Algorithms - Second Edition");
        livro1.setAutor("Loiane Groner");
        livro1.setAnoLancamento(2016);
        livro1.setIsbn("B01C2XX8Y2");

        Livro livro2 = new Livro();
        livro2.setNome("Spring Boot - Acelere o desenvolvimento de microsserviços");
        livro2.setAutor("Fernando Boaglio");
        livro2.setAnoLancamento(2021);
        livro2.setIsbn("978-85-94120-00-7");

        Livro livro3 = new Livro();
        livro3.setNome("Vire o jogo com Spring Framework");
        livro3.setAutor("Henrique Lobo Weissmann");
        livro3.setAnoLancamento(2012);
        livro3.setIsbn("978-85-66250-09-1");

        //estaVazia
        System.out.println("Pilha de livros criada, pilha está vazia? " + pilhaLivrosLivroStack.isEmpty());

        System.out.println("----------------------------------------");

        //empilha
        System.out.println("Empilhando livros na pilha:");
        pilhaLivrosLivroStack.push(livro1);
        pilhaLivrosLivroStack.push(livro2);
        pilhaLivrosLivroStack.push(livro3);

        System.out.println("----------------------------------------");

        //tamanho
        System.out.println(pilhaLivrosLivroStack.size() + " livros foram empilhados:");


        //toString
        System.out.println("\n" + pilhaLivrosLivroStack);

        System.out.println("----------------------------------------");

        //topo da pilha
        System.out.println("Topo da pilha: " + pilhaLivrosLivroStack.peek());

        System.out.println("----------------------------------------");

        //desempilha
        System.out.println("Desempilhando livros da pilha:");

        while (!pilhaLivrosLivroStack.isEmpty()){
            System.out.println("Desempilhando livro: " + pilhaLivrosLivroStack.pop());
        }

        System.out.println("----------------------------------------");

        System.out.println("Todos os livros foram desempilhandos, pilha vazia: " + pilhaLivrosLivroStack.isEmpty());

    }

}


