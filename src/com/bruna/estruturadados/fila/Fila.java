package com.bruna.estruturadados.fila;

//FIFO: first in first out

import com.bruna.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila(int capacidade) {
        super(capacidade); //construtor EstruturaEstatica
    }

    public Fila() {
        super(); //construtor EstruturaEstatica
    }

    //enqueue
    public void enfileira(T elemento){
        super.adicionaElemento(elemento);
    }

    //peek
    public T verificaTopo(){
        if(this.estaVazia()){
            return null;
        }

        return this.elementos[0];
    }

    //dequeue
    public T desenfileira(){
        final int POSICAO = 0;

        T elementoRemovido = this.elementos[POSICAO];

        if(this.estaVazia()){
            return null;
        }

        this.remove(POSICAO);

        return elementoRemovido;
    }
}
