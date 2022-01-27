package com.bruna.estruturadados.vetor;

import java.lang.reflect.Array;

//classe genérica
public class ListaGenerica<T> { //class type

    private T[] elementos; //tipo dinâmico
    private int tamanho;

    //1°opção:
    public ListaGenerica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; //livro: java efetivo
        this.tamanho = 0;
    }

    //2°opção:
//    public ListaGenerica(int capacidade, Class<T> tipoClasse) {
//        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
//        this.tamanho = 0;
//    }


    public boolean adicionaElemento(T elemento){
        this.aumentaCapacidade();

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
    public boolean adicionaElemento(int posicao, T elemento){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!"); //argumentos inválidos
        }

        this.aumentaCapacidade();

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

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] novoVetor = (T[]) new Object[this.elementos.length * 2]; //dobrando a capaciadade

            for (int i = 0; i < this.elementos.length; i++) {
                novoVetor[i] = this.elementos[i];
            }
            this.elementos = novoVetor; //atribuindo novoVetor ao vetor antigo
        }
    }

    public Object buscaElemento(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!"); //argumentos inválidos
        }
        return this.elementos[posicao];
    }

    //verifica se o elemento existe no vetor
    //busca sequencial
    public int buscaElemento(T elemento){
        for (int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }


    // A C D D -> posição a ser removida é 1 (B)
    // 0 1 2 3 -> tamanho é 4
    // vetor[1] = vetor[2]
    // vetor[2] = vetor[3]
    public void remove(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!"); //argumentos inválidos
        }

        for (int i=posicao; i<this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
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
