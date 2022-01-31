package com.bruna.estruturadados.vetor.exercicios;

import com.bruna.estruturadados.vetor.ListaGenerica;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Exercicio02 {

    public static void main(String[] args) {

        ListaGenerica<String> letras = new ListaGenerica<>(3);

        letras.adicionaElemento("A");
        letras.adicionaElemento("B");
        letras.adicionaElemento("A");
        letras.adicionaElemento("C");

        System.out.println(letras.ultimoIndice("C"));
        System.out.println(letras.ultimoIndice("R"));
        System.out.println(letras.ultimoIndice("H"));
        System.out.println(letras.ultimoIndice("A"));
    }
}
