package Semana03;

import java.util.Scanner;

public class Fibonacci{

  public static void main(String[] args) {
    System.out.println("Digite um numero: ");
    Scanner scanner = new Scanner(System.in);
    int numero = scanner.nextInt();

    int a=0, b=1, c;
    int contador=0;
    while(contador<numero){
      System.out.printf("%d ",a);
      c = a+b;
      a = b;
      b = c;
      contador++;
    }
  }
}
