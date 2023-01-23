package model;

public class Agencia implements Entidade {

  private String nome;
  private String logradouro;

  public Agencia(String nome, String logradouro) {
    this.nome = nome;
    this.logradouro = logradouro;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  @Override
  public String getID() {
    // TODO Auto-generated method stub
    return null;
  }
  
}
