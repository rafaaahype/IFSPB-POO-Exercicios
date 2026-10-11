package Semana03;

public class Turma{
  Aluno[] alunos = new Aluno[5];


  //Setando alunos por padrao ao instanciar
  public Turma(){
    alunos[0] = new Aluno("rafael",19347358L);
    alunos[1] = new Aluno("linus",5858447L);
    alunos[2] = new Aluno("tannenbaum",3848585L);
    alunos[3] = new Aluno("james",9484585L);
    alunos[4] = new Aluno("jake",935783L);
  }

  public boolean listarAprovados(){
    for(int i=0; i<5; i++){
      if (alunos[i].verificarAprovacao()){
        System.out.println(alunos[i].getNome());
      }
    }
    return true; //retorna que deu certo a operacao
  }

  public boolean listarReprovados(){
    for(int i=0; i<5; i++){
      if (!(alunos[i].verificarAprovacao())){
        System.out.println(alunos[i].getNome());
      }
    }
    return true; // retorna que deu certo a operacao
  }
}
