package estruturadados.vetor;

import estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

    private T[] elementos;
    private int tamanho;

    public Lista2() {
        super();
    }

    public Lista2(int capacidade) {
        super(capacidade);
    }

    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }

    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public void remove(T elemento) {
        int posicao = this.busca(elemento);
        if (posicao > -1) {
            this.remove(posicao);
        }
    }

    public void limpar() {
        for (int i=0; i<this.tamanho; i++) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }

    public T obtem(int posicao) {
        return this.busca(posicao);
    }

    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public int ultimoIndice(T elemento) {
        int ultimaPosicao = -1;
        for (int i=this.tamanho-1; i>=0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento) {
        return busca(elemento) > -1;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2]; //fazer o casting igual o construtor - continua fazendo um veotr de objeto porém faz o casting pra classe
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");

        return s.toString();
    }
}
