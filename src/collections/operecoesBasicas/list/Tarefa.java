package collections.operecoesBasicas.list;

public class Tarefa {
    //atributo
    private String descricao;

    //criando objeto com construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


    public String toString() {
        return descricao;
    }
}
