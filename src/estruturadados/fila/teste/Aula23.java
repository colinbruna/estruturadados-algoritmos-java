package estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();

        fila.add(1); //enqueue
        fila.add(2);

        System.out.println(fila);
        System.out.println(fila.peek());
        System.out.println(fila.remove());
        System.out.println(fila);
    }
}
