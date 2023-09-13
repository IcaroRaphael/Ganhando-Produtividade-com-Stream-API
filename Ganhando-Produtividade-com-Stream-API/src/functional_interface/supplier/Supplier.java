package functional_interface.supplier;

import java.util.List;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class Supplier {
  public static void main(String[] args) {
    // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
    java.util.function.Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

    // Usar o Supplier para obter uma lista com 5 saudações
    List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(5)
        .toList();

    // Imprimir as saudações geradas
    listaSaudacoes.forEach(System.out::println);
  }
}
