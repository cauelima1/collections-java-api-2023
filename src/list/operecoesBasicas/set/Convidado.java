package list.operecoesBasicas.set;

import java.util.Objects;

public class Convidado {
    //atributos
    private String nome;
    private int conviteConvidado;

    public Convidado(String nome, int conviteConvidado) {
        this.nome = nome;
        this.conviteConvidado = conviteConvidado;
    }

    public String getNome() {
        return nome;
    }

    public int getConviteConvidado() {
        return conviteConvidado;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getConviteConvidado() == convidado.getConviteConvidado();
    }


    public int hashCode() {
        return Objects.hashCode(getConviteConvidado());
    }


    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", conviteConvidado=" + conviteConvidado +
                '}';
    }
}
