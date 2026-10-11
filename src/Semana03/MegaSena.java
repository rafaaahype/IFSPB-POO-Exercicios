package Semana03;

import java.util.Arrays;
import java.util.Scanner;

public class MegaSena{

  public static void main(String[] args) {
    System.out.println("Insira 6 numeros:");
    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[6];
    for(int i=0; i<6; ){
      System.out.printf("Numero %d: ",i+1);
      numeros[i] = scanner.nextInt();
      if(numeros[i]>60 || numeros[i]<1){
        System.out.println("Só podem ser digitados numeros entre 1 e 60, tente novamente");
      } else i++;
    }
    System.out.println("Seus numeros ordenados em ordem crescente:");
    Arrays.sort(numeros);
    System.out.println(Arrays.toString(numeros));
  }
}
