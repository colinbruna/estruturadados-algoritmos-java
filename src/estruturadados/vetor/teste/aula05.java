package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class aula05 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.busca(2));
        System.out.println(vetor.busca(3));
        System.out.println(vetor.busca(15));

    }
}