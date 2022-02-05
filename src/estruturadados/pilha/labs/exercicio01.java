package estruturadados.pilha.labs;

import estruturadados.pilha.Pilha;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Entre com um número:");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Empilhando o número: " + numero);
                pilha.empilha(numero);
            } else {
                Integer desempilhado = pilha.desempilha();
                if (desempilhado == null) {
                    System.out.println("Pilha está vázia");
                } else {
                    System.out.println("Número ímpar, desempilhando um elemento. Elemento: "
                            + desempilhado);
                }
            }
        }
        System.out.println("Todos os números foram lidos. Desempilhando todos os elementos!");

        while (!pilha.estaVazia()) {
            Integer desempilhado = pilha.desempilha();

                System.out.println("Desempilhando um elemento. Elemento: "
                        + pilha.desempilha());
        }
        System.out.println("Todos os elementos foram desempilhados");
    }
}
