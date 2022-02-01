package com.bruna.estruturadados.pilha.exercicios;

/*
 * Utilize a classe Pilha (criada durante as aulas) e desenvolva os seguintes items:
 *
 * 1. Crie uma pilha com capacidade para 20 livros;
 *
 * 2. Insira 6 livros na pilha; Cada livro contém nome, isbn
 * ano de lançamento e autor.
 *
 * 3. Crie um exemplo para utilizar cada método da clase Pilha.
 */


import com.bruna.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Pilha<Livro> pilhaLivros = new Pilha<>(20);

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
        System.out.println("Pilha de livros criada, pilha está vazia? " + pilhaLivros.estaVazia());

        System.out.println("----------------------------------------");

        //empilha
        System.out.println("Empilhando livros na pilha:");
        pilhaLivros.empilha(livro1);
        pilhaLivros.empilha(livro2);
        pilhaLivros.empilha(livro3);

        System.out.println("----------------------------------------");

        //tamanho
        System.out.println(pilhaLivros.tamanhoVetor() + " livros foram empilhados:");


        //toString
        System.out.println("\n" + pilhaLivros);

        System.out.println("----------------------------------------");

        //topo da pilha
        System.out.println("Topo da pilha: " + pilhaLivros.verificaTopo());

        System.out.println("----------------------------------------");

        //desempilha
        System.out.println("Desempilhando livros da pilha:");

        while (!pilhaLivros.estaVazia()){
            System.out.println("Desempilhando livro: " + pilhaLivros.desempilha());
        }

        System.out.println("----------------------------------------");

        System.out.println("Todos os livros foram desempilhandos, pilha vazia: " + pilhaLivros.estaVazia());

    }

}


