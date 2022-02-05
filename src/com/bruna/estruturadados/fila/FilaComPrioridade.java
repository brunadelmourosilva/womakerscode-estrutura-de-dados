package com.bruna.estruturadados.fila;

import com.bruna.estruturadados.fila.Fila;

/*
* Interface Comparable
* obj1 > obj2, retorna > 0(1)
* obj1 < obj2, retorna < 0(-1)
* obj1 = obj2, retorna 0
* */

public class FilaComPrioridade<T> extends Fila<T>{

    public void enfileira(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;

        int i;
        for (i = 0; i < this.tamanho; i++) {
            //comparação entre o elemento adicionado com os dados do vetor
            if(chave.compareTo(this.elementos[i]) < 0){
                break;
            }
        }
        this.adicionaElemento(i, elemento);

    }

}
