package estruturadados.fila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

    public static void main(String[] args) {

        Queue<Paciente> filaComPrioridade = new PriorityQueue<>(new Comparator<Paciente>() {
            @Override
            public int compare(Paciente p1, Paciente p2) {
                return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
            }
        });

        filaComPrioridade.add(new Paciente("A", 2));
        filaComPrioridade.add(new Paciente("B", 1));
        //Adicionando mais dois elementos
        filaComPrioridade.add(new Paciente("C", 5));
        filaComPrioridade.add(new Paciente("D", 4));
        filaComPrioridade.add(new Paciente("E", 3));

        //System.out.println(filaComPrioridade);

        System.out.println(filaComPrioridade.poll());
        System.out.println(filaComPrioridade.poll());
        System.out.println(filaComPrioridade.poll());
        System.out.println(filaComPrioridade.poll());
        System.out.println(filaComPrioridade.poll());

        System.out.println(filaComPrioridade);
    }
}