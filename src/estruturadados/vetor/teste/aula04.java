package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class aula04 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.tamanho());
        //não precisa colocar o toString mas poderá ser tb -- System.out.println(vetor.toString());
        System.out.println(vetor);
    }
}
