package estruturadados.pilha.labs;

import estruturadados.pilha.Pilha;

import java.util.Stack;

public class Exercicio04 {

    public static void main(String[] args) {

        Stack<Livro> stack = new Stack<>();

        Livro livro1 = new Livro();
        livro1.setNome("Nome1");
        livro1.setAnoLancamento(2001);
        livro1.setIsbn("11111111");
        livro1.setAutor("Autor1");

        Livro livro2 = new Livro();
        livro2.setNome("Nome2");
        livro2.setAnoLancamento(2002);
        livro2.setIsbn("222222222");
        livro2.setAutor("Autor2");

        Livro livro3 = new Livro();
        livro3.setNome("Nome3");
        livro3.setAnoLancamento(2003);
        livro3.setIsbn("3333333");
        livro3.setAutor("Autor3");

        Livro livro4 = new Livro();
        livro4.setNome("Nome4");
        livro4.setAnoLancamento(2004);
        livro4.setIsbn("4444444");
        livro4.setAutor("Autor4");

        Livro livro5 = new Livro();
        livro5.setNome("Nome5");
        livro5.setAnoLancamento(2005);
        livro5.setIsbn("5555555");
        livro5.setAutor("Autor5");

        Livro livro6 = new Livro();
        livro6.setNome("Nome6");
        livro6.setAnoLancamento(2006);
        livro6.setIsbn("666666");
        livro6.setAutor("Autor6");

        System.out.println("Pilha de livros criada, pilha está vázia? " + stack.isEmpty());

        System.out.println("Empilhando livros na pilha: ");

        stack.push(livro1);
        stack.push(livro2);
        stack.push(livro3);
        stack.push(livro4);
        stack.push(livro5);
        stack.push(livro6);

        System.out.println(stack.size() + " livros foram empilhados.");

        System.out.println(stack);

        System.out.println("Pilha de livros criada, pilha está vázia? " + stack.isEmpty());

        System.out.println("Espiando o topo da pilha:" + stack.peek());

        System.out.println("Desempilhando livros da pilha");

        while (!stack.isEmpty()) {
            System.out.println("Desempilhando livro: " + stack.pop());
        }
        System.out.println("Todos os livros foram desempilhados, pilha vázia." + stack.isEmpty());
    }
}
