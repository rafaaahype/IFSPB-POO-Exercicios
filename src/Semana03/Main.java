package Semana03;

public class Main{
  public static void main(String[] args) {
    Aluno rafael = new Aluno("rafael",10000);
    rafael.cadastrarNota(10);
    rafael.cadastrarNota(7);
    rafael.cadastrarNota(8);
    rafael.cadastrarNota(9);
    System.out.println(rafael.calcularMedia());
    System.out.println(rafael.verificarAprovacao());
  }
}
