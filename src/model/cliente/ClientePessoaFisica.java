package model.cliente;

public class ClientePessoaFisica extends Cliente {

  public ClientePessoaFisica(String nome, String documento) {
    super(nome, documento);
    this.desconto = 0.95;
  }
  
}
