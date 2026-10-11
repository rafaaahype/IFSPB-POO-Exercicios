package Semana03;

public class Aluno {
  private String nome;
  private long matricula;
  private float[] notas = new float[4];

  private int notasCadastradas = 0;

  public Aluno(String nome, long matricula){
    this.nome = nome;
    this.matricula = matricula;
  }

  public boolean cadastrarNota(int nota){
    if(notasCadastradas < 4) {
      return false;
    }

    notas[notasCadastradas] = nota;
    notasCadastradas++;
    return true;
  }

  public float calcularMedia(){
    return (notas[0]+notas[1]+notas[2]+notas[3])/4;
  }

  //retorna true pra aprovado e false pra reprovado
  public boolean verificarAprovacao(){
    if(calcularMedia()>=7.0) return true;
    return false;
  }


  //Getters
  public String getNome(){
    return nome;
  }
}
