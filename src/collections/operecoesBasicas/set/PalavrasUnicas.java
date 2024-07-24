package collections.operecoesBasicas.set;

import java.util.Objects;

public class PalavrasUnicas {
    private String palavras;

    public PalavrasUnicas(String palavrasUnicas) {
        this.palavras = palavrasUnicas;
    }

    public String getPalavrasUnicas() {
        return palavras;
    }

    @Override
    public String toString() {
        return palavras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PalavrasUnicas that = (PalavrasUnicas) o;
        return Objects.equals(getPalavrasUnicas(), that.getPalavrasUnicas());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPalavrasUnicas());
    }
}
