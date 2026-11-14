package Semana06;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaUsuarios {
  private Map<String, Usuario> usuarios = new LinkedHashMap<>();

  public boolean inserirUsuario(String email, String nome, String senha){
    email = email.trim();
    if(email.isEmpty() || usuarios.containsKey(email)) return false;
    usuarios.put(email, new Usuario(email, nome, senha));
    return true;
  }

  public void listarUsuarios(){
    if(usuarios.isEmpty()){
      System.out.println("Nenhum usuário cadastrado");
      return;
    }
    for(Usuario usuario : usuarios.values()){
      System.out.println("Nome: " + usuario.getNome() + " | E-mail: " + usuario.getEmail());
    }
  }

  public boolean removerUsuario(String email){
    return usuarios.remove(email.trim()) != null;
  }

  public static void main(String[] args){
    SistemaUsuarios sistema = new SistemaUsuarios();
    Scanner scanner = new Scanner(System.in);
    String opcao;
    do {
      System.out.println("1 - Inserir usuário\n2 - Listar usuários\n3 - Remover usuário\n0 - Sair");
      opcao = scanner.nextLine();
      switch(opcao){
        case "1":
          System.out.println("E-mail:");
          String email = scanner.nextLine();
          System.out.println("Nome:");
          String nome = scanner.nextLine();
          System.out.println("Senha:");
          String senha = scanner.nextLine();
          if(sistema.inserirUsuario(email, nome, senha)){
            System.out.println("Usuário cadastrado");
          } else {
            System.out.println("E-mail vazio ou já cadastrado");
          }
          break;
        case "2":
          sistema.listarUsuarios();
          break;
        case "3":
          System.out.println("E-mail do usuário:");
          if(sistema.removerUsuario(scanner.nextLine())){
            System.out.println("Usuário removido");
          } else {
            System.out.println("Usuário não encontrado");
          }
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
