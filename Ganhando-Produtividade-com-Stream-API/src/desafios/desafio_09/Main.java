package desafios.desafio_09;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdenados = numeros.stream().sorted().toList();
        List<Integer> numerosOrdenadosSemRepeticao = numeros.stream().distinct().sorted().toList();

        boolean verificaIgualdade = numerosOrdenados.equals(numerosOrdenadosSemRepeticao);

        System.out.println("Todos os números da lista são distintos: " + verificaIgualdade);
    }
}