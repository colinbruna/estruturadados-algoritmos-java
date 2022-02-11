package estruturadados.fila.exercicios;

import estruturadados.fila.Fila;

public class Exercicio02 {

    public static void main(String[] args) {

        Fila<String> filaNormal = new Fila<>();
        Fila<String> filaPrioridade = new Fila<>();

        final int MAX_FILAPRIORIDADE = 3;

        filaNormal.enfileira("Pessoa 1");
        filaNormal.enfileira("Pessoa 2");
        filaNormal.enfileira("Pessoa 3");
        filaPrioridade.enfileira("Pessoa 1P");
        filaPrioridade.enfileira("Pessoa 2P");
        filaPrioridade.enfileira("Pessoa 3P");
        filaPrioridade.enfileira("Pessoa 4P");
        filaPrioridade.enfileira("Pessoa 5P");
        filaNormal.enfileira("Pessoa 4");
        filaNormal.enfileira("Pessoa 5");
        filaNormal.enfileira("Pessoa 6");
        filaNormal.enfileira("Pessoa 7");
        filaNormal.enfileira("Pessoa 8");

        while (!filaNormal.estaVazia() || !filaPrioridade.estaVazia()) {
            int contadorFila = 0;
            while (!filaPrioridade.estaVazia() && contadorFila < MAX_FILAPRIORIDADE) {
                atendimento(filaPrioridade);
                contadorFila++;
            }
            if (!filaNormal.estaVazia()) {
                atendimento(filaNormal);
            }
            if (filaPrioridade.estaVazia()) {
                while (!filaNormal.estaVazia()) {
                    atendimento(filaNormal);
                }
            }
        }
    }
    public static void atendimento (Fila<String> fila) {
        String pessoaAtendida = fila.desenfileira();
        System.out.println(pessoaAtendida + " foi atendida!");
    }
}
