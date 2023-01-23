package model.cliente;

import model.Entidade;

public abstract class Cliente implements Entidade {

  String nome;
  String documento;
  Double desconto;

  public Cliente(String nome, String documento) {
    this.nome = nome;
    this.documento = documento;
  }

  public String getNome() {
    return nome;
  }

  public Double getDesconto() {
    return desconto;
  }

  @Override
  public String getID() {
    return documento;
  }
  
}
