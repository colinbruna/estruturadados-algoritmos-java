package estruturadados.fila.teste;

import estruturadados.fila.Fila;

public class Aula22 {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        fila.enfileira(1);
        fila.enfileira(5);
        fila.enfileira(10);

        System.out.println(fila);

        fila.desenfileira();

        System.out.println(fila);

        fila.desenfileira();

        System.out.println(fila);
    }
}
