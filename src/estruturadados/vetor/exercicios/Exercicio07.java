package estruturadados.vetor.exercicios;

import estruturadados.vetor.teste.Contato;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio07 extends Exercicio06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Contato> ArrayList = new ArrayList<>(20);

        criarContatosDinamicamente(5, ArrayList);

        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaoMenu(sc);

            switch (opcao) {

                case 1:
                    adicionarContatoFinal(sc, ArrayList);
                    break;
                case 2:
                    adicionarContatoPosicao(sc, ArrayList);
                    break;
                case 3:
                    obtemContatoPosicao(sc, ArrayList);
                    break;
                case 4:
                    obtemContato(sc, ArrayList);
                    break;
                case 5:
                    pesquisarUltimoIndice(sc, ArrayList);
                    break;
                case 6:
                    pesquisarContatoExiste(sc, ArrayList);
                    break;
                case 7:
                    excluirPorPosicao(sc, ArrayList);
                    break;
                case 8:
                    excluirContato(sc, ArrayList);
                    break;
                case 9:
                    imprimeTamanhoVetor(ArrayList);
                    break;
                case 10:
                    limparVetor(ArrayList);
                    break;
                case 11:
                    imprimirVetor(ArrayList);
                    break;
                default:
                    break;
            }
        }
        System.out.println("Usuário digitou 0, programa terminado.");
    }

    private static void imprimirVetor(ArrayList<Contato> ArrayList) {

        System.out.println(ArrayList);
        System.out.println();
    }

    private static void limparVetor(ArrayList<Contato> lista) {

        lista.clear();
        System.out.println("Todos os contatos do vetor foram excluídos");
        System.out.println();
    }

    private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {

        System.out.println("Tamanho do vetor é de: " + lista.size());
        System.out.println();
    }

    private static void excluirContato(Scanner sc, ArrayList<Contato> lista) {

        int posicao = leInformacaoInt("Entre com a posição a ser removida", sc);

        try {
            Contato contato = lista.get(posicao);
            lista.remove(contato);
            System.out.println("Contato removido");
            System.out.println();
        } catch (Exception E){
            System.out.println("Posição inválida!");
            System.out.println();
        }
    }

    private static void excluirPorPosicao(Scanner sc, ArrayList<Contato> ArrayList) {

        int posicao = leInformacaoInt("Entre com a posição a ser removida", sc);

        try {
            ArrayList.remove(posicao);
            System.out.println("Contato removido");
            System.out.println();
        } catch (Exception E){
            System.out.println("Posição inválida!");
            System.out.println();
        }
    }

    private static void pesquisarContatoExiste(Scanner sc, ArrayList<Contato> lista) {

        int posicao = leInformacaoInt("Entre com a posição a ser perquisada", sc);

        try {
            Contato contato = lista.get(posicao);

            boolean existe = lista.contains(contato);

            if (existe) {
                System.out.println("Contato existe, seguem dados");
                System.out.println();
                System.out.println(contato);
                System.out.println();
            } else {
                System.out.println("Contato não existe");
                System.out.println();
            }
        } catch (Exception E){
            System.out.println("Posição inválida!");
            System.out.println();
        }
    }

    private static void pesquisarUltimoIndice(Scanner sc, ArrayList<Contato> lista) {

        int posicao = leInformacaoInt("Entre com a posição a ser perquisada", sc);

        try {
            Contato contato = lista.get(posicao);
            System.out.println("Contato existe, seguem dados");
            System.out.println();
            System.out.println(contato);
            System.out.println();

            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
            System.out.println();
            posicao = lista.lastIndexOf(contato);

            System.out.println("Contato encontrado na posição " + posicao);
            System.out.println();
        } catch (Exception E){
            System.out.println("Posição inválida!");
            System.out.println();
        }
    }

    private static void obtemContato(Scanner sc, ArrayList<Contato> lista) {

        int posicao = leInformacaoInt("Entre com a posição a ser perquisada", sc);

        try {
            Contato contato = lista.get(posicao);
            System.out.println("Contato existe, seguem dados");
            System.out.println();
            System.out.println(contato);
            System.out.println();

            System.out.println("Fazendo pesquisa do contato encontrado:");
            System.out.println();
            posicao = lista.indexOf(contato);

            System.out.println("Contato encontrado na posição " + posicao);
            System.out.println();
        } catch (Exception E){
            System.out.println("Posição inválida!");
            System.out.println();
        }
    }

    private static void obtemContatoPosicao(Scanner sc, ArrayList<Contato> lista) {

        int posicao = leInformacaoInt("Entre com a posição a ser perquisada", sc);

        try {
            Contato contato = lista.get(posicao);
            System.out.println("Contato existe, seguem dados");
            System.out.println();
            System.out.println(contato);
            System.out.println();
        } catch (Exception E){
            System.out.println("Posição inválida!");
            System.out.println();
        }
    }

    private static void adicionarContatoFinal(Scanner sc, ArrayList<Contato> lista){

        System.out.println("Criando um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome", sc);
        String telefone = leInformacao("Entre com o telefone", sc);
        String email = leInformacao("Entre com o email", sc);

        Contato contato = new Contato(nome, telefone, email);

        lista.add(contato);

        System.out.println("Contato adicionado com sucesso");
        System.out.println();
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner sc, ArrayList<Contato> lista){

        System.out.println("Criando um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome", sc);
        String telefone = leInformacao("Entre com o telefone", sc);
        String email = leInformacao("Entre com o email", sc);

        Contato contato = new Contato(nome, telefone, email);

        int posicao = leInformacaoInt("Entre com a posição a adicionar o contato", sc);

        try {
            lista.add(posicao, contato);
            System.out.println("Contato adicionado com sucesso");
            System.out.println();
            System.out.println(contato);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado");
            System.out.println();
        }
    }

    private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {

        Contato contato;

        for (int i=1; i<=quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato: " + i);
            contato.setTelefone("11111111" + i);
            contato.setEmail("contato" +i+"@email.com");

            lista.add(contato);
        }
    }
}