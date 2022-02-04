package estruturadados.pilha.teste;

import estruturadados.pilha.Pilha;

import java.util.Stack;

public class Aula18 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty()); //está vázio

        stack.push(1);
        stack.push(2);

        System.out.println(stack.isEmpty());//vázio
        System.out.println(stack.size());//tamanho
        System.out.println(stack);//toString
        System.out.println(stack.peek());//espiar
        System.out.println(stack.pop());//desempilhar
        System.out.println(stack);

    }
}
