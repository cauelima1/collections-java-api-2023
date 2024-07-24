package collections.operecoesBasicas.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty())
            agendaContatoMap.remove(nome);
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;


    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Caue", 12);
        agendaContatos.adicionarContato("Vedrana", 14);
        agendaContatos.adicionarContato("Jose Felipe", 14);
        agendaContatos.adicionarContato("Vedrana", 14);
        agendaContatos.adicionarContato("Jose Felipe", 14);


        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Caue");

        System.out.println(agendaContatos.pesquisarPorNome("Jose Felipe"));

    }
}
