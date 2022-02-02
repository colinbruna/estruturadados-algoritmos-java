package estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("C");
        arrayList.add(0, "B"); //add passando a posição e o elemento

        System.out.println(arrayList);

        boolean existe = arrayList.contains("A"); //método de busca
        if (existe) {
            System.out.println("Elemento existe no array");
        } else {
            System.out.println("Elemento não existe no array");
        }

        int posicao = arrayList.indexOf("F");
        if (posicao > -1) {
            System.out.println("Elemento existe no array na posição " + posicao);
        } else {
            System.out.println("Elemento não existe no array " + posicao);
        }

        //a busca por posição é através do método get
        System.out.println(arrayList.get(2));

        //método para remover
        arrayList.remove(0);
        arrayList.remove("C");

        System.out.println(arrayList);

        System.out.println(arrayList.size());//tamanho do array


    }
}
