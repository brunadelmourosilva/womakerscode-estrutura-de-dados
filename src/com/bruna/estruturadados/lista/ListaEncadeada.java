package com.bruna.estruturadados.lista;

public class ListaEncadeada<T> {

    No<T> inicio;

    public void adicionaNo(T elemento){
        No<T> no = new No<>(elemento);
        this.inicio = no; //aponta para o início do nó
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio=" + inicio +
                '}';
    }
}
