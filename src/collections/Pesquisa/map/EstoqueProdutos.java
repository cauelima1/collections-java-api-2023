package collections.Pesquisa.map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    // criando HashMap vazio para receber elementos.
    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque =0d;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) ;
                produtoMaisCaro = p;
                maiorPreco = p.getPreco();
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() < menorPreco){
                        produtoMaisBarato = p;
                        menorPreco = p.getPreco();
                }
            }
        }
            return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValor = null;
        double valorTotalProduto = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (valorTotalProduto < (p.getQuantidade() * p.getPreco())){
                    produtoMaiorQuantidadeValor = p;
                    valorTotalProduto = p.getPreco()*p.getQuantidade();
                }
            }
        }
        return produtoMaiorQuantidadeValor;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "Pao", 100, 1.2);
        estoqueProdutos.adicionarProduto(2, "Cafe", 6, 4.1);
        estoqueProdutos.adicionarProduto(3, "Bolacha", 2, 1d);
        estoqueProdutos.adicionarProduto(4, "Leite", 10, 5.2);

        estoqueProdutos.exibirProdutos();

        System.out.println("O valor total em estoque: " + estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("O produto mais caro do estoque: " + estoqueProdutos.obterProdutoMaisCaro());

        System.out.println("O produto mais barato do estoque: " + estoqueProdutos.obterProdutoMaisBarato());

        System.out.println("O produto com maior valor em estoque: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }

}


