package com.bruna.estruturadados.vetor.exercicios;

import com.bruna.estruturadados.vetor.ListaGenerica;

import java.util.ArrayList;
import java.util.List;

public class Exercicio03 {

    public static void main(String[] args) {

        ListaGenerica<String> letras = new ListaGenerica<>(4);

        letras.adicionaElemento("A");
        letras.adicionaElemento("B");
        letras.adicionaElemento("C");
        letras.adicionaElemento("D");

        letras.remove("C");
        System.out.println(letras);


    }
}
