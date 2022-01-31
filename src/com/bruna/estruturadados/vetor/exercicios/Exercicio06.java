package com.bruna.estruturadados.vetor.exercicios;

import com.bruna.estruturadados.vetor.ListaGenerica;
import com.bruna.estruturadados.vetor.testes.Contato;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio06 {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {


        //vetor com capacidade para 20 contatos
        ListaGenerica<Contato> contatos = new ListaGenerica<>(20);

        //criar e adicionar X contatos
        criarListaContatos(5, contatos);


        //opções
        int op;
        do{
            op = exibeOpcoes();
            switch (op){
                case 1: adicionarContatoFinal(contatos);
                    break;
                case 2: adicionarContatoPosicaoEspecifica(contatos);
                    break;
                case 3: obtemContatoPosicao(contatos);
                    break;
                case 4: obtemContato(contatos);
                    break;
                case 5: pesquisarUltimoIndice(contatos);
                    break;
                case 6: contatoExiste(contatos);
                    break;
                case 7: excluirPorPosicao(contatos);
                    break;
                case 8: imprimeTamanhoVetor(contatos);
                    break;
                case 9: limparVetor(contatos);
                    break;
                case 10: imprimirVetor(contatos);
                    break;
                case 0:
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("Opção incorreta.");
            }
        }while(op != 0);

    }

    private static void adicionarContatoFinal(ListaGenerica<Contato> contatos){

        SC.nextLine();
        System.out.print("Digite o nome: ");
        String nome = SC.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = SC.nextLine();
        System.out.print("Digite o email: ");
        String email = SC.nextLine();

        Contato contato = new Contato(nome, telefone, email);

        contatos.adicionaElemento(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicaoEspecifica(ListaGenerica<Contato> contatos){

        SC.nextLine();
        System.out.print("Digite o nome: ");
        String nome = SC.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = SC.nextLine();
        System.out.print("Digite o email: ");
        String email = SC.nextLine();

        Contato contato = new Contato(nome, telefone, email);

        System.out.print("Entre com a posição a adicionar o contato: ");
        int pos = SC.nextInt(); //validar entrada

        try {
            contatos.adicionaElemento(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);

        } catch (Exception e){
            System.out.println("Posição inválida! Contato não adicionado.");
        }
    }

    private static void obtemContatoPosicao(ListaGenerica<Contato> contatos){

        System.out.print("Entre com a posição a ser pesquisada: ");
        int pos = SC.nextInt();

        try {

            Contato contato = (Contato) contatos.buscaElemento(pos);

            System.out.println("Dados do contato existente:");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(ListaGenerica<Contato> contatos){

        System.out.print("Entre com a posição a ser pesquisada: ");
        int pos = SC.nextInt();

        try {

            Contato contato = (Contato) contatos.buscaElemento(pos);

            System.out.println("Dados do contato existente:");
            System.out.println(contato);

            System.out.println("Pesquisa do contato encontrado:");
            pos = contatos.buscaElemento(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(ListaGenerica<Contato> contatos){

        System.out.print("Entre com a posição a ser pesquisada: ");
        int pos = SC.nextInt();

        try {

            Contato contato = (Contato) contatos.buscaElemento(pos);

            System.out.println("Dados do contato existente:");
            System.out.println(contato);

            System.out.println("Pesquisa do último índice do contato encontrado:");
            pos = contatos.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void contatoExiste(ListaGenerica<Contato> contatos){

        System.out.print("Entre com a posição a ser pesquisada: ");
        int pos = SC.nextInt();

        try {

            Contato contato = (Contato) contatos.buscaElemento(pos);

            boolean existe = contatos.contem(contato);

            if (existe){
                System.out.println("Dados do contato existente:");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPorPosicao(ListaGenerica<Contato> contatos){

        System.out.print("Entre com a posição a ser pesquisada: ");
        int pos = SC.nextInt();

        try {

            System.out.println("Dados do contato a serem excluídos: ");
            Contato contato = (Contato) contatos.buscaElemento(pos);

            System.out.println(contato);
            System.out.println("-------------------------------------");
            contatos.remove(pos);
            System.out.println("Contato excluído");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void imprimeTamanhoVetor(ListaGenerica<Contato> contatos){

        System.out.println("O tamanho do vetor é de: " + contatos.tamanhoVetor() + "posições");
    }

    private static void limparVetor(ListaGenerica<Contato> contatos){

        contatos.limpar();
        System.out.println("Todos os contatos do vetor foram removidos");
    }

    private static void imprimirVetor(ListaGenerica<Contato> contatos){

        System.out.println(contatos);
    }

    public static void criarListaContatos(int qtd, ListaGenerica<Contato> contatos){

        Contato contato;
        for (int i = 0; i < qtd; i++) {
            contato = new Contato();

            contato.setNome("Contato " + i);
            contato.setTelefone("1111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            contatos.adicionaElemento(contato);
        }
    }

    public static int exibeOpcoes(){
        System.out.println("--------------------------------------");
        System.out.print(
                "1: Adiciona contato no final do vetor\n" +
                        "2: Adiciona contato em uma posição específica\n" +
                        "3: Obtém contato de uma posição específica\n" +
                        "4: Consulta contato\n" +
                        "5: Consulta último índide do contato\n" +
                        "6: Verifica se contato existe\n" +
                        "7: Excluir contato por posição\n" +
                        "8: Verifica tamanho do vetor\n"+
                        "9: Excluir todos os contatos do vetor\n" +
                        "10: Imprime vetor\n" +
                        "0: Sair\n");

        System.out.println("--------------------------------------");
        System.out.print("Escolha uma opção: ");
        int op = SC.nextInt();
        return op;
    }
}
