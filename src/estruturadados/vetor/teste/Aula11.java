package estruturadados.vetor.teste;

import estruturadados.vetor.Lista;

public class Aula11 {

    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista<>(1);

        Contato c1 = new Contato("Contato 1", "1111-1111", "contato1@email.com");

        vetor.adiciona(c1);
    }
}
