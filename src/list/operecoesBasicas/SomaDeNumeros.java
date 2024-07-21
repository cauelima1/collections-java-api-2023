package list.operecoesBasicas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SomaDeNumeros {
    private List<Integer> somaDeNumeroList;

    public SomaDeNumeros() {
        this.somaDeNumeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        somaDeNumeroList.add(numero);
    }

    public int calcularSoma(){
        int soma=0;
        //List<Integer> somaLista = new ArrayList<>();
        if (!somaDeNumeroList.isEmpty()){
            for(Integer n : somaDeNumeroList){
                soma+=n.intValue();
            }
        }
        return soma;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Collections.min(somaDeNumeroList);
        return menorNumero;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Collections.max(somaDeNumeroList);
        return maiorNumero;
    }

    public String toString() {
        return "SomaDeNumeros{" +
                "somaDeNumeroList=" + somaDeNumeroList +
                '}';
    }

    public static void main(String[] args) {
        SomaDeNumeros somaDeNumeros = new SomaDeNumeros();

        somaDeNumeros.adicionarNumero(1);
        somaDeNumeros.adicionarNumero(2);
        somaDeNumeros.adicionarNumero(3);
        somaDeNumeros.adicionarNumero(4);
        somaDeNumeros.adicionarNumero(5);
        somaDeNumeros.adicionarNumero(6);
        somaDeNumeros.adicionarNumero(7);

        System.out.println("A Soma dos numeros da lista: " + somaDeNumeros.calcularSoma());
        System.out.println("O maior numero: " + somaDeNumeros.encontrarMaiorNumero());
        System.out.println("O menor numero: " + somaDeNumeros.encontrarMenorNumero());
        System.out.println("Os numeros da lista sao: " + somaDeNumeros.somaDeNumeroList);
    }
}
