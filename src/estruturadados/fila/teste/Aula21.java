package estruturadados.fila.teste;

import estruturadados.fila.Fila;

public class Aula21 {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.verificarPrimeiroDaFila());

        fila.enfileira(16);
        fila.enfileira(5);

        System.out.println(fila.verificarPrimeiroDaFila());
        System.out.println(fila);
    }
}
