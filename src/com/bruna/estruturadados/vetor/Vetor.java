package com.bruna.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    //    public void adicionaElemento(String elemento){
//        for (int i = 0; i < this.elementos.length; i++) {
//            if(this.elementos[i] == null){
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }
    public boolean adicionaElemento(String elemento){
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;

            return true;
        }
        return false;
    }

    //A, B, C, D = tamanho 4
    //0, 1, 2, 3 + +

    //A, B, x, C, D = tamanho 5
    //0, 1, 2, 3, 4 + +

    //overload
    public boolean adicionaElemento(int posicao, String elemento){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!"); //argumentos inválidos
        }

        //mover todos os elementos
        //de trás para frente
        for (int i=this.tamanho-1; i>=posicao; i--){ // 3 até 2
            this.elementos[i+1] = this.elementos[i]; //this.elementos[4] = D
        }

        //atribui o novo elemento na posição desejada
        this.elementos[posicao] = elemento;
        this.tamanho++;
        
        return false;
    }

    public String buscaElemento(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!"); //argumentos inválidos
        }
        return this.elementos[posicao];
    }

    //verifica se o elemento existe no vetor
    //busca sequencial
    public int buscaElemento(String elemento){
        for (int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public int tamanhoVetor(){
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder string = new StringBuilder();

        string.append("[");

        for (int i = 0; i < this.tamanho-1; i++) {
            string.append(this.elementos[i]);
            string.append(", ");
        }

        if(this.tamanho > 0){
            string.append(this.elementos[this.tamanho-1]); //acessando a última posição, mas sem a vírgula
        }

        string.append("]");

        return string.toString();
    }

}
