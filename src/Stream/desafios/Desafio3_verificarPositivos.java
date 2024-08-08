package Stream.desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio3_verificarPositivos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Verificando números positivos...");



                numeros.stream()
                .filter(n -> n > 0)
                .forEach(System.out::println);
    }
}
