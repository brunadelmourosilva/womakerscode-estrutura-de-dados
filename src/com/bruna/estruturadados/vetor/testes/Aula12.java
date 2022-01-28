package com.bruna.estruturadados.vetor.testes;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("B");

        System.out.println(arrayList);

        arrayList.add(2, "C");

        System.out.println(arrayList);

        //busca por elemento
        boolean contem = arrayList.contains("A");
        if(contem)
            System.out.println("Elemento existe no arraylist");
        else
            System.out.println("Elemento não existe no arraylist");

        //índice do elemento
        int posicao = arrayList.indexOf("B");
        if (posicao > -1){
            System.out.println("Elemento existe no array na posição " + posicao);
        } else {
            System.out.println("Elemento não existe no array " + posicao);
        }

        //busca por posição
        System.out.println(arrayList.get(2));

        //remoção por índice
        arrayList.remove(0);

        //remoção por elemento
        arrayList.remove("B");

        System.out.println(arrayList);

        //sobrescrever um elemento em determinada posição
        arrayList.set(1, "x");

        System.out.println(arrayList);

        //tamanho do arraylist
        System.out.println(arrayList.size());

        //https://developer.classpath.org/doc/java/util/ArrayList-source.html
    }
}
