package model.cliente;

public class ClientePessoaJuridica extends Cliente {

  public ClientePessoaJuridica(String nome, String documento) {
    super(nome, documento);
    this.desconto = 0.9;
  }
  
}
