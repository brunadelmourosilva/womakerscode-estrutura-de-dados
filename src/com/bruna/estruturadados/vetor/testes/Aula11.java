package com.bruna.estruturadados.vetor.testes;

import com.bruna.estruturadados.vetor.ListaGenerica;
import com.bruna.estruturadados.vetor.VetorObjects;

//Generics - vetores genéricos
public class Aula11 {

    public static void main(String[] args) {

        ListaGenerica<String> listaString = new ListaGenerica<String>(1);

        listaString.adicionaElemento("Elemento String");
        System.out.println(listaString);

        System.out.println("--------------------------");

        Contato c1 = new Contato("Bruna", "09090909", "brunadelmouro@gmail.com");

        ListaGenerica<Contato> listaContato = new ListaGenerica<Contato>(1);

        listaContato.adicionaElemento(c1);
        System.out.println(listaContato);
    }
}
