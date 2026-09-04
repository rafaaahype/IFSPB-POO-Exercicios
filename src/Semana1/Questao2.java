package Semana1;

import java.util.Scanner;

public class Questao2 {
  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int numero = scanner.nextInt();
    
    if(numero%3==0) System.out.println("Múltiplo de 3");
    if(numero%5==0) System.out.println("Múltiplo de 5");
    if(numero%3==0 && numero%5==0) System.out.println("Múltiplo de 3 e 5");
    else if(numero%3!=0 && numero%5!=0) System.out.println("Não é múltiplo de 3 nem de 5");
  }
}
