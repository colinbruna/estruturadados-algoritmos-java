package estruturadados.vetor.exercicios;

import estruturadados.vetor.Lista;

public class Exercicio01 {

    public static void main(String[] args) {

        Lista<Integer> lista = new Lista<Integer>(4);

        lista.adiciona(4);
        lista.adiciona(3);
        lista.adiciona(5);

        System.out.println(lista.contem(5));
        System.out.println(lista.contem(1));
    }
}
