package estruturadados.fila.exercicios;

import estruturadados.fila.Fila;

public class Exercicio01 {

    public static void main(String[] args) {

        Fila<Doc> filaImprimir = new Fila<>();

        filaImprimir.enfileira(new Doc("AAA",1));
        filaImprimir.enfileira(new Doc("BBB",5));
        filaImprimir.enfileira(new Doc("CCC",3));

        System.out.println(filaImprimir);
        System.out.println();

        while (!filaImprimir.estaVazia()) {
            Doc doc = filaImprimir.desenfileira();
            System.out.println("Imprimindo documento " + doc.getNomeDoc());
        }

        System.out.println();
        System.out.println("Todos os docs foram impressos!");
    }
}
