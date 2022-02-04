package com.bruna.estruturadados.fila.testes;

import com.bruna.estruturadados.fila.FilaComPrioridade;
import com.bruna.estruturadados.fila.Paciente;

import java.util.LinkedList;
import java.util.Queue;

public class Aula24 {
    public static void main(String[] args) {

        FilaComPrioridade<Paciente> fp = new FilaComPrioridade<>();

        //prioridade de ordenação
//        fp.enfileira(3);
//        fp.enfileira(1);
//        fp.enfileira(2);
//
//        System.out.println(fp);

        fp.enfileira(new Paciente("A", 2));
        fp.enfileira(new Paciente("C", 1));
        fp.enfileira(new Paciente("B", 3));

        System.out.println(fp);

        System.out.println(fp.desenfileira());

        System.out.println(fp);
    }
}
