package com.bruna.estruturadados.lista;

public class ListaEncadeada<T> {

    No<T> inicio;
    private Integer tamanho = 0;

    public void adicionaNo(T elemento){
        No<T> no = new No<>(elemento);
        this.inicio = no; //aponta para o início do nó

        this.tamanho++;
    }

    public Integer getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio=" + inicio +
                '}';
    }
}
