package Stream.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio5_mediaNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer soma = numeros.stream()
                .filter(n -> n > 5)
                .reduce(0,(Integer::sum));

        double media = soma / numeros.stream().filter(n -> n > 5).count();
        System.out.println(media);
    }
}
