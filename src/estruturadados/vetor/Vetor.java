package estruturadados.vetor;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

   /*public void adiciona(String elemento) {
        for (int i=0; i<this.elementos.length; i++){
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/

    /*public void adiciona(String elemento) throws Exception {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
        }
    }*/

    //metodo para acrescentar um elemento no final do vetor
    public boolean adiciona(String elemento){
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
    //remover um elemento do vetor
    public void remove(int posicao){
        if (!(posicao >=0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i=posicao; i<this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    //como obter o elemento de uma determinada posição - busca
    public String busca(int posicao){
        if (!(posicao >=0 && posicao < tamanho)){ //lógica para verificar se a posição é válida
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    //metodo para verificar se um determinado elemento existe num vetor
    public int busca(String elemento){
        for (int i=0; i<this.tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    //metodo para add um elemento em qualquer posição do vetor -- se eu já tiver um elemento na posição que eu
    // quero, devo passar esse e todos os proximos elementos para o proximo vetor para abrir espaço e conseguir inserir o novo elemento na posição que eu quero
    public boolean adiciona(int posicao, String elemento){
        this.aumentaCapacidade();
                //lógica para verificar se a posição é válida
        if (!(posicao >=0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        //mover todos os elementos
        for (int i=this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento; //atribuindo o elemento para a posição
        this.tamanho++;//adicionando mais um para o tamanho

        return true;
    }

    //adicionar capacidade ao vetor dinamicamente - vou aumentar o tamanho do vetor sempre que o tamanho for igual a capacidade (this.tamanho == this.elementos.length)
    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    //metodo para mostrar o tamanho do vetor
    public int tamanho(){
        return this.tamanho;
    }

    //metodo para imprimir todos os elementos do vetor
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");

        return s.toString();
    }
}
