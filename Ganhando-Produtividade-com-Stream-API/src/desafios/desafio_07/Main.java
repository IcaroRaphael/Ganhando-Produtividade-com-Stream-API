package desafios.desafio_07;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosEmOrdem = numeros.stream().distinct().sorted().toList();

        int segundoMaiorNumero = numerosEmOrdem.get(numerosEmOrdem.size()-2);
        System.out.println("O segundo maior numero: " + segundoMaiorNumero);
    }
}
