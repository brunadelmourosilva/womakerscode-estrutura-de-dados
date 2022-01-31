package com.bruna.estruturadados.pilha;

//LIFO: last in first out

import com.bruna.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(int capacidade) {
        super(capacidade); //construtor EstruturaEstatica
    }

    public Pilha() {
        super(); //construtor EstruturaEstatica
    }

    //push
    public void empilha(T elemento){
        super.adicionaElemento(elemento);
    }

    //peek
    public T verificaTopo(){
        if(this.estaVazia())
            return null;

        return this.elementos[tamanho-1];
    }

    //pop
    public T desempilha(){
        if(this.estaVazia())
            return null;

        T topo = this.elementos[tamanho-1];
        this.tamanho--;

        //ou: return this.elementos[--tamanho];
        return topo;
    }
}
