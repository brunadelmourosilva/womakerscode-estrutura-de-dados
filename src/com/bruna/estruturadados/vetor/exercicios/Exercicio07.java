package com.bruna.estruturadados.vetor.exercicios;

import com.bruna.estruturadados.vetor.ListaGenerica;
import com.bruna.estruturadados.vetor.testes.Contato;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio07 extends Exercicio06{
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) throws IOException, InterruptedException {


        //vetor com capacidade para 20 contatos
        List<Contato> contatos = new ArrayList<>(20);

        //criar e adicionar X contatos
        criarListaContatos(5, contatos);


        //opções
        int op;
        do{
            Exercicio07.tempoDeEspera();
            op = exibeOpcoes();
            switch (op){
                case 1: Exercicio07.adicionarContatoFinal(contatos);
                    break;
                case 2: Exercicio07.adicionarContatoPosicaoEspecifica(contatos);
                    break;
                case 3: Exercicio07.obtemContatoPosicao(contatos);
                    break;
                case 4: Exercicio07.obtemContato(contatos);
                    break;
                case 5: Exercicio07.pesquisarUltimoIndice(contatos);
                    break;
                case 6: Exercicio07.contatoExiste(contatos);
                    break;
                case 7: Exercicio07.excluirPorPosicao(contatos);
                    break;
                case 8: Exercicio07.imprimeTamanhoVetor(contatos);
                    break;
                case 9: Exercicio07.limparVetor(contatos);
                    break;
                case 10: Exercicio07.imprimirVetor(contatos);
                    break;
                case 0:
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("Opção incorreta.");
            }
        }while(op != 0);

    }

    private static void adicionarContatoFinal(List<Contato> contatos){

        SC.nextLine();
        String[] infos = Exercicio07.lerInformacoes();

        Contato contato = new Contato(infos[0], infos[1], infos[2]); //nome,telefone e e-mail

        contatos.add(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicaoEspecifica(List<Contato> contatos){

        SC.nextLine();
        String[] infos = Exercicio07.lerInformacoes();

        Contato contato = new Contato(infos[0], infos[1], infos[2]); //nome,telefone e e-mail

        System.out.print("Entre com a posição a adicionar o contato: ");
        int pos = SC.nextInt();

        try {
            contatos.add(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);

        } catch (Exception e){
            System.out.println("Posição inválida! Contato não adicionado.");
        }
    }

    private static void obtemContatoPosicao(List<Contato> contatos){

        System.out.print("Entre com a posição a ser pesquisada: ");
        int pos = SC.nextInt();

        try {

            Contato contato = (Contato) contatos.get(pos);

            System.out.println("Dados do contato existente:");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(List<Contato> contatos){

        System.out.print("Entre com a posição a ser pesquisada: ");
        int pos = SC.nextInt();

        try {

            Contato contato = (Contato) contatos.get(pos);

            System.out.println("Dados do contato existente:");
            System.out.println(contato);

            System.out.println("Pesquisa do contato encontrado:");
            pos = contatos.indexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(List<Contato> contatos){

        System.out.print("Entre com a posição a ser pesquisada: ");
        int pos = SC.nextInt();

        try {

            Contato contato = (Contato) contatos.get(pos);

            System.out.println("Dados do contato existente:");
            System.out.println(contato);

            System.out.println("Pesquisa do último índice do contato encontrado:");
            pos = contatos.lastIndexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void contatoExiste(List<Contato> contatos){

        System.out.print("Entre com a posição a ser pesquisada: ");
        int pos = SC.nextInt();

        try {

            Contato contato = (Contato) contatos.get(pos);

            boolean existe = contatos.contains(contato);

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

    private static void excluirPorPosicao(List<Contato> contatos){

        System.out.print("Entre com a posição a ser pesquisada: ");
        int pos = SC.nextInt();

        try {

            System.out.println("Dados do contato a serem excluídos: ");
            Contato contato = (Contato) contatos.get(pos);

            System.out.println(contato);
            System.out.println("-------------------------------------");
            contatos.remove(pos);
            System.out.println("Contato excluído");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void imprimeTamanhoVetor(List<Contato> contatos){

        System.out.println("O tamanho do vetor é de: " + contatos.size() + " posições");
    }

    private static void limparVetor(List<Contato> contatos) throws InterruptedException {

        System.out.println("Tem certeza que deseja excluir todos os contatos da lista? [1] - Sim | [2] - Não");
        int opcao;

        do {
            opcao = SC.nextInt();
            switch (opcao) {
                case 1:
                    contatos.clear();
                    System.out.println("Todos os contatos do vetor foram removidos");
                    break;
                case 2:
                    System.out.println("Os contatos não foram excluídos. Voltando ao menu inicial.");
                    Exercicio07.tempoDeEspera();
                    break;
                default:
                    System.out.print("Opção Incorreta!" + "\n" + "Digite novamente: ");
                    opcao = SC.nextInt();
                    break;
            }
        } while (!(opcao == 1 || opcao == 2));

    }

    private static void imprimirVetor(List<Contato> contatos){

        System.out.println(contatos);
    }

    public static void criarListaContatos(int qtd, List<Contato> contatos){

        Contato contato;
        for (int i = 0; i < qtd; i++) {
            contato = new Contato();

            contato.setNome("Contato " + i);
            contato.setTelefone("1111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            contatos.add(contato);
        }
    }
}
