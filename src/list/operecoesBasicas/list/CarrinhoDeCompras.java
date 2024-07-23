package list.operecoesBasicas.list;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CarrinhoDeCompras {
    //atributos
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuant();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            // Criando uma instância do carrinho de compras
            CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

            int escolha = 1;
            while (escolha == 1 || escolha == 2 || escolha == 3 || escolha == 4) {
                System.out.println("1- Incluir produtos | 2- Remover produtos | 3- Calcular valor total | 4- Exibir produtos | 5- Sair");
                escolha = entrada.nextInt();
                switch (escolha) {
                    case 1:
                        System.out.println("Informe o nome do produto:");
                        String nome = entrada.next();
                        System.out.println("Informe o preco do produto:");
                        double preco = entrada.nextDouble();
                        System.out.println("Informe a quantidade de itens: ");
                        int quant = entrada.nextInt();

                        carrinhoDeCompras.adicionarItem(nome, preco, quant);
                        break;
                    case 2:
                        System.out.println("Informe o nome do produto para remove-lo: ");
                        String remover = entrada.next();
                        carrinhoDeCompras.removerItem(remover);

                        break;
                    case 3:
                        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
                        break;
                    case 4:
                        carrinhoDeCompras.exibirItens();
                        break;

                }
            }
        } catch (InputMismatchException e){
            System.out.println("Informe corretamente os valores!");
        }


    }
}