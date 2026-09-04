package Semana1;

import java.util.Scanner;

public class Questao4 {

  public static void main(String[] args) {
      
    Scanner scanner = new Scanner(System.in);
    int numero;
    do{
      System.out.println("Digite um numero entre 1 e 30:");
      numero = scanner.nextInt();
    }while(numero<1 || numero>30);

    for(int i = 0; i<numero; i++) System.out.print("*");
    System.out.println();
  }
}
