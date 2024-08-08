package Stream.desafios;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Desafio14_maiorNumeroPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5,101, 7, 8, 9, 19, 5, 4, 3);

        System.out.println(numeros.stream().filter(n -> n % 2 !=0 && n % 3 !=0 && n % 5 !=0 && n % 7 !=0).max(Comparator.naturalOrder()));
    }
}
