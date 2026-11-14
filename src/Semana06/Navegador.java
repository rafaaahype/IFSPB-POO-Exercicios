package Semana06;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Navegador {
  private Deque<String> paginas = new ArrayDeque<>();

  public void acessarPagina(String titulo){
    paginas.push(titulo);
    mostrarPaginaAtual();
  }

  public void voltar(){
    if(paginas.size() <= 1){
      System.out.println("Não há página anterior");
      return;
    }
    paginas.pop();
    mostrarPaginaAtual();
  }

  public void mostrarPaginaAtual(){
    if(paginas.isEmpty()){
      System.out.println("Nenhuma página aberta");
    } else {
      System.out.println("Página atual: " + paginas.peek());
    }
  }

  public static void main(String[] args){
    Navegador navegador = new Navegador();
    Scanner scanner = new Scanner(System.in);
    String opcao;
    do {
      System.out.println("1 - Acessar página\n2 - Voltar\n3 - Página atual\n0 - Sair");
      opcao = scanner.nextLine();
      switch(opcao){
        case "1":
          System.out.println("Título da página:");
          navegador.acessarPagina(scanner.nextLine());
          break;
        case "2":
          navegador.voltar();
          break;
        case "3":
          navegador.mostrarPaginaAtual();
          break;
        case "0":
          break;
        default:
          System.out.println("Opção inválida");
      }
    } while(!opcao.equals("0"));
    scanner.close();
  }
}
