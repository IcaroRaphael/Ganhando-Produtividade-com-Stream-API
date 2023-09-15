package desafios.desafio_13;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int start = 5;
        int finish = 10;

        List<Integer> numerosIntervalo = numeros.stream()
                .filter(n -> n > start && n < finish)
                .toList();

        numerosIntervalo.forEach(System.out::println);
    }
}
