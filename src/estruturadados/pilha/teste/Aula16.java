package estruturadados.pilha.teste;

import estruturadados.pilha.Pilha;

public class Aula16 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.topo());

        pilha.empilha(5);

        System.out.println(pilha.topo());
    }
}
