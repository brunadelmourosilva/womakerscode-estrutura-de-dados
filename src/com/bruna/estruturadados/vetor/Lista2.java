package com.bruna.estruturadados.vetor;

import com.bruna.estruturadados.base.EstruturaEstatica;

//diagrama de classes: Lista2
//https://github.com/brunadelmourosilva/womakerscode-estrutura-de-dados/issues/15

public class Lista2<T> extends EstruturaEstatica<T> {

    public Lista2(int capacidade) {
        super(capacidade); //construtor EstruturaEstatica
    }

    public Lista2() {
        super(); //construtor EstruturaEstatica
    }

    public boolean adicionaElemento(T elemento){
        //referência à superclasse EstruturaEstatica
        return super.adicionaElemento(elemento);
    }

    public boolean adicionaElemento(int posicao, T elemento){
        //referência à superclasse EstruturaEstatica
        return super.adicionaElemento(posicao, elemento);
    }

    public void remove(int posicao){
        //referência à superclasse EstruturaEstatica
        super.remove(posicao);
    }


}
