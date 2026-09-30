package Semana03;

public class Aluno {
  //Atributos da Classe
  private String nome;
  private long matricula;
  private int[] notas = new int[4];

  //Posição da Nota Atual
  private int pos = 0;

  public Aluno(String nome, long matricula) {
    this.nome = nome;
    this.matricula = matricula;
  }

  //Cadastro de Notas
  public boolean cadastrarNota(int nota){
    if(pos<4){
      this.notas[pos] = nota;
      pos++;
      return true;
    }
    return false;
  }

  //Cálculo de Média:
  public int calcularMedia(){
    return (notas[0]+notas[1]+notas[2]+notas[3]) / 4;
  }

  //Verificação de Aprovação
  public boolean verificarAprovacao(){
    int media = calcularMedia();
    
    if(media>=7) return true;
    return false;
  }

}
