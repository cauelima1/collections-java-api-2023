package Stream.desafios;

import java.util.*;

public class Desafio7_encontrarSegundoMaior {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int maiorNumero = numeros.stream().max(Comparator.naturalOrder()).orElseThrow(() -> new NoSuchElementException());
        int segundoMaiorNumero = numeros.stream().filter(n -> n != maiorNumero).max(Comparator.naturalOrder()).orElseThrow(() -> new NoSuchElementException());

        System.out.println(segundoMaiorNumero);

    }
}
