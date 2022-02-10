package estruturadados.fila.exercicios;

public class Doc {

    private String nomeDoc;
    private int numFolhas;

    public Doc(String nomeDoc, int numFolhas) {
        super();
        this.nomeDoc = nomeDoc;
        this.numFolhas = numFolhas;
    }

    public String getNomeDoc() {
        return nomeDoc;
    }

    public void setNomeDoc(String nomeDoc) {
        this.nomeDoc = nomeDoc;
    }

    public int getNumFolhas() {
        return numFolhas;
    }

    public void setNumFolhas(int numFolhas) {
        this.numFolhas = numFolhas;
    }

    @Override
    public String toString() {
        return "Doc{" +
                "nomeDoc='" + nomeDoc + '\'' +
                ", numFolhas=" + numFolhas +
                '}';
    }
}
