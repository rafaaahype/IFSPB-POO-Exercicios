package Semana1;

import java.util.Scanner;

public class Questao3{
  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número inteiro positivo: ");
    int numero = scanner.nextInt();

    for(int i=2; i<=numero; i++){
      int divisores = 0;
      for(int k=1; k<=i; k++)
        if(i%k==0) divisores++;
      if(divisores==2) System.out.printf("%d ", i);
    }
    System.out.println();
  }
}
