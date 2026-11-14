package Semana06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

public class Questao6 {
  public static void main(String[] args){
    // Letra A
    List<Integer> numeros = new ArrayList<>(Arrays.asList(-5, 3, -1, 0, 8, -9, 2));
    numeros = numeros.stream()
        .filter(numero -> numero >= 0)
        .collect(Collectors.toList());
    System.out.println("Números sem os negativos: " + numeros);

    // Letra B
    List<String> nomes = Arrays.asList("Pedro", "Ana", "Paulo", "Maria", "Patricia", "pedro");
    System.out.println("Strings que iniciam com P:");
    nomes.stream()
        .filter(nome -> nome.startsWith("P"))
        .forEach(System.out::println);

    // Letra C
    String paragrafo = "Java possui listas, conjuntos e mapas. Java possui streams também.";
    Set<String> palavras = Arrays.stream(paragrafo.toLowerCase(Locale.ROOT).split("[^\\p{L}\\p{N}]+"))
        .filter(palavra -> !palavra.isEmpty())
        .collect(Collectors.toCollection(LinkedHashSet::new));
    System.out.println("Palavras únicas: " + palavras);
  }
}
