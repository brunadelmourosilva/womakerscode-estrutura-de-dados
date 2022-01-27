package com.bruna.estruturadados.vetor.testes;

import com.bruna.estruturadados.vetor.Vetor;
import com.bruna.estruturadados.vetor.VetorObjects;

public class Aula10 {

    public static void main(String[] args) {

        VetorObjects vetor = new VetorObjects(3);

        Contato c1 = new Contato("Contato 1", "0000000", "contato1@gmail.com");
        Contato c2 = new Contato("Contato 2", "1111111", "contato2@gmail.com");
        Contato c3 = new Contato("Contato 3", "2222222", "contato3@gmail.com");

        Contato c4 = new Contato("Contato 1", "0000000", "contato1@gmail.com"); //ocupa referências diferentes na memória

        //autoboxing
        //vetor.adicionaElemento(3);
        //vetor.adicionaElemento(4);

        vetor.adicionaElemento(c1);
        vetor.adicionaElemento(c2);
        vetor.adicionaElemento(c3);

        System.out.println("tamanho = " + vetor.tamanhoVetor());
        System.out.println(vetor);

        int posicao = vetor.buscaElemento(c4);
        if(posicao >= 0){
            vetor.remove(posicao);
            System.out.println("ok");
        } else {
            System.out.println("O elemento não existe");
        }
    }
}
