package com.bruna.estruturadados.base;

//diagrama de classes: EstruturaEstatica(superclasse)
//https://github.com/brunadelmourosilva/womakerscode-estrutura-de-dados/issues/15

public class EstruturaEstatica<T> {

    private T[] elementos; //tipo dinâmico
    private int tamanho;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; //livro: java efetivo
        this.tamanho = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }


    protected boolean adicionaElemento(T elemento){
        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;

            return true;
        }
        return false;
    }

    protected boolean adicionaElemento(int posicao, T elemento){
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
