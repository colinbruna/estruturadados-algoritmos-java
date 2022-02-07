package estruturadados.fila.teste;

import estruturadados.fila.FilaComPrioridade;

public class Aula24 {

    public static void main(String[] args) {

        FilaComPrioridade<Integer> fila = new FilaComPrioridade<Integer>(10);

        fila.enfileira(1);
        fila.enfileira(3);
        fila.enfileira(2);

        System.out.println(fila);
    }
}
