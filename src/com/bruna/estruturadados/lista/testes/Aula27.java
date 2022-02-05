package com.bruna.estruturadados.lista.testes;

import com.bruna.estruturadados.lista.ListaEncadeada;

public class Aula27 {

    public static void main(String[] args) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adicionaNo(1);

        System.out.println("Tamanho da lista: " + lista.getTamanho());
        System.out.println(lista);
    }
}
