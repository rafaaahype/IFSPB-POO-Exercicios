package Semana02;

public class Produto{

  private int codigo;
  private String nome;
  private double preco;
  private int estoque;

  public Produto(int codigo, String nome, double preco, int estoque) {
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
    this.estoque = estoque;
  }

  //Getters
  public int getCodigo() {
    return codigo;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getEstoque() {
    return estoque;
  }

  //Setters
  public void setPreco(double preco) {
    if(preco>=0) this.preco = preco;
    else System.out.println("Erro. Valores negativos não são aceitos.");
  }

  //Métodos da Classe
  
  public void exibirInfo(){
    System.out.printf("Código: %d\nNome: %s\nPreço: %.2f\nEstoque: %d\n",
        codigo, nome, preco, estoque);
  }

}
