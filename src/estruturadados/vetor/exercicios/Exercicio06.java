package estruturadados.vetor.exercicios;

import estruturadados.vetor.Lista;
import estruturadados.vetor.teste.Contato;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Lista<Contato> lista = new Lista<Contato>(20);

        criarContatosDinamicamente(5, lista);

        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaoMenu(sc);

            switch (opcao) {

                case 1:
                    adicionarContatoFinal(sc, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(sc, lista);
                    break;
                case 3:
                    obtemContatoPosicao(sc, lista);
                    break;
                case 4:
                    obtemContato(sc, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(sc, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(sc, lista);
                    break;
                case 7:
                    excluirPorPosicao(sc, lista);
                    break;
                case 8:
                    excluirContato(sc, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirVetor(lista);
                    break;
                default:
                    break;
            }
        }
        System.out.println("Usuário digitou 0, programa terminado.");
    }

    private static void imprimirVetor(Lista<Contato> lista) {

        System.out.println(lista);
        System.out.println();
    }

    private static void limparVetor(Lista<Contato> lista) {

        lista.limpar();
        System.out.println("Todos os contatos do vetor foram excluídos");
        System.out.println();
    }

    private static void imprimeTamanhoVetor(Lista<Contato> lista) {

        System.out.println("Tamanho do vetor é de: " + lista.tamanho());
        System.out.println();
    }

    private static void excluirContato(Scanner sc, Lista<Contato> lista) {

        int posicao = leInformacaoInt("Entre com a posição a ser removida", sc);

        try {
            Contato contato = lista.busca(posicao);
            lista.remove(contato);
            System.out.println("Contato removido");
            System.out.println();
        } catch (Exception E){
            System.out.println("Posição inválida!");
            System.out.println();
    }
}

    private static void excluirPorPosicao(Scanner sc, Lista<Contato> lista) {

        int posicao = leInformacaoInt("Entre com a posição a ser removida", sc);

        try {
            lista.remove(posicao);
            System.out.println("Contato removido");
            System.out.println();
            } catch (Exception E){
            System.out.println("Posição inválida!");
            System.out.println();
        }
    }

    private static void pesquisarContatoExiste(Scanner sc, Lista<Contato> lista) {

        int posicao = leInformacaoInt("Entre com a posição a ser perquisada", sc);

        try {
            Contato contato = lista.busca(posicao);

            boolean existe = lista.contem(contato);

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

    private static void pesquisarUltimoIndice(Scanner sc, Lista<Contato> lista) {

        int posicao = leInformacaoInt("Entre com a posição a ser perquisada", sc);

        try {
            Contato contato = lista.busca(posicao);
            System.out.println("Contato existe, seguem dados");
            System.out.println();
            System.out.println(contato);
            System.out.println();

            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
            System.out.println();
            posicao = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição " + posicao);
            System.out.println();
        } catch (Exception E){
            System.out.println("Posição inválida!");
            System.out.println();
        }
    }

    private static void obtemContato(Scanner sc, Lista<Contato> lista) {

        int posicao = leInformacaoInt("Entre com a posição a ser perquisada", sc);

        try {
            Contato contato = lista.busca(posicao);
            System.out.println("Contato existe, seguem dados");
            System.out.println();
            System.out.println(contato);
            System.out.println();

            System.out.println("Fazendo pesquisa do contato encontrado:");
            System.out.println();
            posicao = lista.busca(contato);

            System.out.println("Contato encontrado na posição " + posicao);
            System.out.println();
        } catch (Exception E){
            System.out.println("Posição inválida!");
            System.out.println();
        }
    }

    private static void obtemContatoPosicao(Scanner sc, Lista<Contato> lista) {

        int posicao = leInformacaoInt("Entre com a posição a ser perquisada", sc);

        try {
            Contato contato = lista.busca(posicao);
            System.out.println("Contato existe, seguem dados");
            System.out.println();
            System.out.println(contato);
            System.out.println();
        } catch (Exception E){
            System.out.println("Posição inválida!");
            System.out.println();
        }
    }

    private static void adicionarContatoFinal(Scanner sc, Lista<Contato> lista){

        System.out.println("Criando um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome", sc);
        String telefone = leInformacao("Entre com o telefone", sc);
        String email = leInformacao("Entre com o email", sc);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);

        System.out.println("Contato adicionado com sucesso");
        System.out.println();
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner sc, Lista<Contato> lista){

        System.out.println("Criando um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome", sc);
        String telefone = leInformacao("Entre com o telefone", sc);
        String email = leInformacao("Entre com o email", sc);

        Contato contato = new Contato(nome, telefone, email);

        int posicao = leInformacaoInt("Entre com a posição a adicionar o contato", sc);

        try {
            lista.adiciona(posicao, contato);
            System.out.println("Contato adicionado com sucesso");
            System.out.println();
            System.out.println(contato);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado");
            System.out.println();
        }
    }

    private static String leInformacao(String mensagem, Scanner sc) {

        System.out.println(mensagem);
        String entrada = sc.nextLine();

        return entrada;
    }

    private static int leInformacaoInt(String mensagem, Scanner sc) {

        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {
            try {
                System.out.println(mensagem);
                String entrada = sc.nextLine();
                num = Integer.parseInt(entrada);
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente");
                System.out.println();
            }
        }
        return num;
    }

    private static int obterOpcaoMenu(Scanner sc) {

        boolean entradaValida = false;
        int opcao = 0;

        while (!entradaValida) {
            System.out.println("Digite a opção desejada:");
            System.out.println("1: Adiciona contato no final do vetor");
            System.out.println("2: Adiciona contato em uma posição específica");
            System.out.println("3: Obtém contato de uma posição específica");
            System.out.println("4: Consulta contato");
            System.out.println("5: Consulta último índice do contato");
            System.out.println("6: Verifica se contato existe");
            System.out.println("7: Remove por posição");
            System.out.println("8: Excluir contato");
            System.out.println("9: Verifica tamanho do vetor");
            System.out.println("10: Excluir todos os contatos do vetor");
            System.out.println("11: Imprime vetor");
            System.out.println("0: Sair");
            System.out.println();

            try {
                String entrada = sc.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente\n\n");
            }
        }
        return opcao;
    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {

        Contato contato;

        for (int i=1; i<=quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato: " + i);
            contato.setTelefone("11111111" + i);
            contato.setEmail("contato" +i+"@email.com");

            lista.adiciona(contato);
        }
    }
}