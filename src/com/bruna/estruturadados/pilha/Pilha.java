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

}
