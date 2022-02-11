package estruturadados.pilha.labs;

import estruturadados.pilha.Pilha;

public class Exercicio06 {

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static void main(String[] args) {

        imprimeResultado("((A + B"); //false
        imprimeResultado("A + B)"); //false
        imprimeResultado("A + B"); //true
        imprimeResultado("A + B + (C - D)"); //true
        imprimeResultado("{[()]}[](){()}"); //true
        imprimeResultado("{[(]}[](){()}"); //false
        imprimeResultado("A + B + C - D)"); //false
    }

    public static void imprimeResultado(String expressao) {
        System.out.println(expressao + " está balanceado? " +
                verificaSimbolosBalanceados(expressao));
    }

    public static boolean verificaSimbolosBalanceados(String expressao) {

        Pilha<Character> pilha = new Pilha<>();
        char simbolo, topo;

        for (int i = 0; i < expressao.length(); i++) {
            simbolo = expressao.charAt(i);

            if (ABRE.indexOf(simbolo) > -1) {
                pilha.empilha(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {
                if (pilha.estaVazia()) {
                    return false;
                } else {
                    topo = pilha.desempilha();
                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }

        }
        return pilha.estaVazia();
    }
}