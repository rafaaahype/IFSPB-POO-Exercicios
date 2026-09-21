package Semana02;

public class ContaCorrente{
  
  private int numero;
  private String titular;
  private float saldo;

  public ContaCorrente(int numero, String titular, float saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }

  public boolean sacar(float valor){
    if(saldo >= valor && valor <= 10000 && valor > 0){
      saldo-=valor;
      return true;
    }
    return false;
  }

  public boolean depositar(float valor){
    if(valor > 0 && !(valor > 10000)){
      saldo+=valor;
      return true;
    }
    return false;
  }

  public void consultarSaldo(){
    System.out.printf("\nSaldo: %.2f\n", saldo);
  }
}
