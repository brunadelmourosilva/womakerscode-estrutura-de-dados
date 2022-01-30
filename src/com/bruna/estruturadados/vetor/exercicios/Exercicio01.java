package com.bruna.estruturadados.vetor.exercicios;

import com.bruna.estruturadados.vetor.ListaGenerica;

import java.util.ArrayList;
import java.util.List;

public class Exercicio01 {

    public static void main(String[] args) {
        ListaGenerica<Integer> numeros = new ListaGenerica<Integer>(3);

        numeros.adicionaElemento(1);
        numeros.adicionaElemento(2);
        numeros.adicionaElemento(3);

        if(numeros.contem(4))
            System.out.println("O elemento existe");
        else
            System.out.println("O elemento não existe");
    }


}
