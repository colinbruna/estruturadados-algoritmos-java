package estruturadados.pilha.labs;

import com.sun.source.tree.IfTree;
import estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Pilha<Integer> pilhaPar = new Pilha<>();
        Pilha<Integer> pilhaImpar = new Pilha<>();

        Scanner sc = new Scanner(System.in);

        for (int i=1; i<=10; i++) {

            System.out.println("Entre com um número");

            int numero = sc.nextInt();
            if (numero == 0) {
                Integer desempilhado = pilhaPar.desempilha();
                if (desempilhado == null) {
                    System.out.println("Pilha par esta vázia");
                } else {
                    System.out.println("Desempilhando da pilha par: " + desempilhado);
                }
                desempilhado = pilhaImpar.desempilha();
                if (desempilhado == null) {
                    System.out.println("Pilha ímpar esta vázia");
                } else {
                    System.out.println("Desempilhando da pilha ímpar: " + desempilhado);
                }
            } else if (numero % 2 == 0) {
                System.out.println("Número par, empilhando na pilha par: " + numero);
                pilhaPar.empilha(numero);
            } else {
                System.out.println("Número ímpar, empilahndo na pilha ímpar: " + numero);
                pilhaImpar.empilha(numero);
            }
        }
        System.out.println("Desempilhando todos os números da pilha par");
        while (!pilhaPar.estaVazia()) {
            System.out.println("Desempilhando da pilha par " + pilhaPar.desempilha());
        }
        System.out.println("Desempilhando todos os números da pilha ímpar");
        while (!pilhaImpar.estaVazia()) {
            System.out.println("Desempilhando da pilha ímpar " + pilhaImpar.desempilha());
        }
    }
}
