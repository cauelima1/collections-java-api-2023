package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.MissingFormatArgumentException;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int soma=0;
        //List<Integer> somaLista = new ArrayList<>();
        if (!numeros.isEmpty()){
            for(Integer numero : numeros){
                soma+=numero;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()){
            for (Integer numero:numeros){
                if(numero>=maiorNumero)
                    maiorNumero=numero;
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }

    }

//    public int encontrarMaiorNumero(){
//        int maiorNumero = Collections.max(numeros);
//        return maiorNumero;
//    }



    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()){
            for (Integer numero: numeros){
                if(numero<=menorNumero){
                    menorNumero=numero;
                }
            }
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
        return menorNumero;
    }

//    public int encontrarMenorNumero(){
//        int menorNumero = Collections.min(numeros);
//        return menorNumero;
//    }


    public void exibirNumeros(){
        if (!numeros.isEmpty())
            System.out.println("Os numeros da lista sao: " + numeros);
        else
            System.out.println("A lista esta vazia!");
    }

    public String toString() {
        return "SomaDeNumeros{" +
                "somaDeNumeroList=" + numeros +
                '}';
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(-(-11));
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(7);

        System.out.println("Numeros adicionados: " + somaNumeros.numeros);

        System.out.println("A Soma dos numeros da lista: " + somaNumeros.calcularSoma());

        System.out.println("O maior numero: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("O menor numero: " + somaNumeros.encontrarMenorNumero());

    }
}
