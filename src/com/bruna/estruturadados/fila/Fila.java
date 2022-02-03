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


    public void enfileira(T elemento){
        this.adicionaElemento(elemento);
    }


    public T verificaTopo(){
        if(this.estaVazia()){
            return null;
        }

        return this.elementos[0];
    }


    public T desenfileira(){
        return null;
    }
}
