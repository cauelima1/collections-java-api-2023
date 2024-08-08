package Stream.desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio11_somaDosQuadrados {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        // nao esta funcionando, aguardando issue
        Integer numerosAoQuadrado = numeros.stream().reduce(0, (a, b) -> (a*a) + (b*b));
        System.out.println(numerosAoQuadrado);

    }

}
