package collections.operecoesBasicas.map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        dicionarioMap.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String palavraPesquisada = null;
        if (!dicionarioMap.isEmpty()) {
            palavraPesquisada = dicionarioMap.get(palavra);
        } else {
            System.out.println("Lista vazia!");
        }
        return palavraPesquisada;
    }


    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Porta", "Objeto fixo que serve para fechar ou trancar salas.");
        dicionario.adicionarPalavra("Raiva", "Estado emocional que demonstra estar bravo com alguma situacao.");
        dicionario.adicionarPalavra("Tablet", "Um eletronico com telas 'grandes' parecidos com aparelhos Smartphone porem maiores.");
        dicionario.adicionarPalavra("Ketchup", "Molho usado em pratos de comida a base do molho de tomate.");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Porta");
        dicionario.removerPalavra("R");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Tablet"));
    }
}

