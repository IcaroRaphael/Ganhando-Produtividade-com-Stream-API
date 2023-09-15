package desafios.desafio_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = new ArrayList<>();
        numeros.forEach(n -> {
            int cont = 0;
            for(int i = 1; i <= n; i++){
                if(n % i == 0){
                    cont++;
                }
            }
            if(cont == 2){
                numerosPrimos.add(n);
            }
        });

        System.out.println(numerosPrimos.stream().sorted().toList().get(numerosPrimos.size()-1));
    }
}
