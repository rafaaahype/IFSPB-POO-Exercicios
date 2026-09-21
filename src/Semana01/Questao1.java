package Semana1;

import java.util.Scanner;

public class Questao1{
  
  public static void main(String[] args){
   
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o nome de um aluno: ");
    String nomeAluno = scanner.nextLine();
    float[] notas = new float[3];
    for(int i=0; i<notas.length; i++){
      System.out.printf("Insira a nota %d: \n", i+1);
      notas[i] = scanner.nextFloat();
    }
    
    float mediaAritmeticaPonderada = 0f, peso = 2f;
    for(int i=0; i<notas.length; i++) 
      mediaAritmeticaPonderada += (float) i==2?notas[i]*peso:notas[i];
    mediaAritmeticaPonderada /= (float) (notas.length-1)+peso;

    System.out.printf("A média do(a) %s é %.2f\n", nomeAluno, mediaAritmeticaPonderada);
  }
}
