package com.bruna.estruturadados.fila.exercicios;

/*
 * Usando  a estrutura de dados Fila, crie uma fila de documentos que precisam
 * ser impressos. Cada documento é composto de um nome e quantidade de folhas
 * a serem impressas. O programa deve:
 * - Enfileirar os documentos;
 * - E seguindo a ordem, o programa deve imprimir cada documento,
 *   desenfileirando da fila. Se desejar pode usar Threads para esperar
 *   a impressão de acordo com o numero de folhas a serem impressas.*/

import com.bruna.estruturadados.fila.Fila;
import com.bruna.estruturadados.fila.exercicios.classes.Documento;

public class Exercicio01 {

    public static void main(String[] args) {

        Fila<Documento> documentos = new Fila<>();

        documentos.enfileira(new Documento("Doc 1", 3));
        documentos.enfileira(new Documento("Doc 2", 8));
        documentos.enfileira(new Documento("Doc 3", 2));
        documentos.enfileira(new Documento("Doc 4", 1));

        while (!documentos.estaVazia()){
            Documento doc = documentos.desenfileira();

            System.out.println("Documento impresso: " + doc.getNome());

            System.out.print("\nAguardando impressão");
            for (int i = 0; i < doc.getQtdFolhas(); i++) {
                try {
                    System.out.print(". ");
                    Thread.sleep(500 * doc.getQtdFolhas());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("\n----------------------");
        }
        System.out.println("Documentos impressos!");
    }
}
