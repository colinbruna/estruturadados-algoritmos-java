package estruturadados.vetor.exercicios;

import estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exercicio02 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>(5);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");

        System.out.println("A última posição em que o elemento aparece é a: " + arrayList.lastIndexOf("A"));

        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");

        System.out.println("A última posição em que o elemento aparece é a: " + lista.ultimoIndice("A"));
    }
}
