package Semana02;

import java.util.Scanner;

public class Main{

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o nome do titular:");
    String titular = scanner.nextLine();
    System.out.println("Digite o número da conta:");
    int numeroDaConta = scanner.nextInt();

    ContaCorrente usuario = new ContaCorrente(numeroDaConta, titular, 0f);

    int resposta = 0;

    do{
      System.out.printf(
          "1-Sacar um valor\n2-Depositar um valor\n3-Consultar o saldo\n4-Sair do programa\n\n"
          );
      resposta = scanner.nextInt();
      switch(resposta){
        case 1:
          System.out.println("Digite um valor a ser sacado:");
          float valorSacar = scanner.nextFloat();
          usuario.sacar(valorSacar);
        break;

        case 2:
          System.out.println("Digite um valor a ser depositado:");
          float valorDepositar = scanner.nextFloat();
          usuario.depositar(valorDepositar);
        break;

        case 3:
          usuario.consultarSaldo();
        break;
      }
    }while(resposta!=4);
    System.out.println("Fim do programa.");
  }
}
