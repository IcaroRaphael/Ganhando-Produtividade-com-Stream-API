package desafios.desafio_08;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

//        // SOLUÇÃO SEM STREAM
//        String numeroString = null;
//        for(int i = 0; i < numeros.size(); i++){
//            if(i == 0){
//                numeroString = numeros.get(i).toString();
//            }
//            else{
//                numeroString += numeros.get(i).toString();
//            }
//        }
//
//        int soma = 0;
//        for(int i = 0; i < numeroString.length(); i++){
//            soma += Integer.parseInt(Character.toString(numeroString.charAt(i)));
//        }

        int soma = numeros.stream()
                .map(numero -> Integer.toString(numero)) // Converte cada número em uma string
                .flatMap(numeroString -> Arrays.stream(numeroString.split(""))) // Divide cada string em dígitos
                .map(Integer::parseInt) // Converte cada dígito de volta para inteiro
                .mapToInt(Integer::intValue) // Converte os valores em IntStream
                .sum(); // Soma os dígitos

        System.out.println(soma);

    }
}
