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
