package com.bruna.estruturadados.vetor.exercicios;

import com.bruna.estruturadados.vetor.ListaGenerica;
import com.bruna.estruturadados.vetor.testes.Contato;

import java.io.IOException;
import java.util.Scanner;

/*
 * Utilize a classe Lista ou Vetor e classe Contato (criada durante as aulas) e desenvolva os seguintes items:
 *
 * 1. Crie um vetor com capacidade para 20 contatos;
 * 2. Insira 30 contatos no vetor (isso é possível ser feito através de um loop);
 * 3. Crie um exemplo para utilizar cada método da classe Lista;
 */

public class Exercicio06 {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) throws IOException, InterruptedException {


        //vetor com capacidade para 20 contatos
        ListaGenerica<Contato> contatos = new ListaGenerica<>(20);

        //criar e adicionar X contatos
        criarListaContatos(5, contatos);


        //opções
        int op;
        do{
            Exercicio06.tempoDeEspera();
            op = exibeOpcoes();
            switch (op){
                case 1: Exercicio06.adicionarContatoFinal(contatos);
                    break;
                case 2: Exercicio06.adicionarContatoPosicaoEspecifica(contatos);
                    break;
                case 3: Exercicio06.obtemContatoPosicao(contatos);
                    break;
                case 4: Exercicio06.obtemContato(contatos);
                    break;
                case 5: Exercicio06.pesquisarUltimoIndice(contatos);
                    break;
                case 6: Exercicio06.contatoExiste(contatos);
                    break;
                case 7: Exercicio06.excluirPorPosicao(contatos);
                    break;
                case 8: Exercicio06.imprimeTamanhoVetor(contatos);
                    break;
                case 9: Exercicio06.limparVetor(contatos);
                    break;
                case 10: Exercicio06.imprimirVetor(contatos);
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
        String[] infos = Exercicio06.lerInformacoes();

        Contato contato = new Contato(infos[0], infos[1], infos[2]); //nome,telefone e e-mail

        contatos.adicionaElemento(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicaoEspecifica(ListaGenerica<Contato> contatos){

        SC.nextLine();
        String[] infos = Exercicio06.lerInformacoes();

        Contato contato = new Contato(infos[0], infos[1], infos[2]); //nome,telefone e e-mail

        System.out.print("Entre com a posição a adicionar o contato: ");
        int pos = SC.nextInt();

        try {
            contatos.adicionaElemento(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);

        } catch (Exception e){
            System.out.println("Posição inválida! Contato não adicionado.");
        }
    }

    protected static String[] lerInformacoes(){
        String[] infos = new String[3];

        System.out.print("Digite o nome: ");
        infos[0] = SC.nextLine();

        System.out.print("Digite o telefone: ");
        infos[1] = SC.nextLine();

        System.out.print("Digite o email: ");
        infos[2] = SC.nextLine();

        return infos;
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

        System.out.println("O tamanho do vetor é de: " + contatos.tamanhoVetor() + " posições");
    }

    private static void limparVetor(ListaGenerica<Contato> contatos) throws InterruptedException {

        System.out.println("Tem certeza que deseja excluir todos os contatos da lista? [1] - Sim | [2] - Não");
        int opcao;

        do {
            SC.nextLine();
            opcao = SC.nextInt();
            switch (opcao) {
                case 1:
                    contatos.limpar();
                    System.out.println("Todos os contatos do vetor foram removidos");
                    break;
                case 2:
                    System.out.println("Os contatos não foram excluídos. Voltando ao menu inicial.");
                    Exercicio06.tempoDeEspera();
                    break;
                default:
                    System.out.print("Opção Incorreta!" + "\n" + "Digite novamente: ");
                    opcao = SC.nextInt();
                    break;
            }
        } while (!(opcao == 1 || opcao == 2));

    }

    private static void imprimirVetor(ListaGenerica<Contato> contatos){

        System.out.println(contatos);
    }

    protected static void criarListaContatos(int qtd, ListaGenerica<Contato> contatos){

        Contato contato;
        for (int i = 0; i < qtd; i++) {
            contato = new Contato();

            contato.setNome("Contato " + i);
            contato.setTelefone("1111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            contatos.adicionaElemento(contato);
        }
    }

    protected static void tempoDeEspera() throws InterruptedException {

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            System.out.print(".");
        }
        System.out.println();
    }

    //plugin para limpar console do IntelliJ: grep console
    protected static int exibeOpcoes(){
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
