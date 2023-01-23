package model;

import java.util.UUID;

import model.cliente.Cliente;
import model.veiculo.Veiculo;

public class Aluguel implements Entidade {

  Cliente cliente;
  Agencia agenciaRetirada;
  Agencia agenciaDevolucao;
  Veiculo veiculo;
  String dataRetirada;
  String dataDevolucao;
  Boolean encerrado;
  UUID id;

  public Aluguel(Cliente cliente, Veiculo veiculo, Agencia agenciaRetirada, Agencia agenciaDevolucao,
   String dataRetirada, String dataDevolucao) {

    this.cliente = cliente;
    this.agenciaRetirada = agenciaRetirada;
    this.agenciaDevolucao = agenciaDevolucao;
    this.veiculo = veiculo;
    this.dataRetirada = dataRetirada;
    this.dataDevolucao = dataDevolucao;
    encerrado = false;
    id = UUID.randomUUID();
  }

  public Cliente getCliente() {
    return cliente;
  }

  public Agencia getAgenciaRetirada() {
    return agenciaRetirada;
  }

  public void setAgenciaRetirada(Agencia agenciaRetirada) {
    this.agenciaRetirada = agenciaRetirada;
  }

  public Agencia getAgenciaDevolucao() {
    return agenciaDevolucao;
  }

  public void setAgenciaDevolucao(Agencia agenciaDevolucao) {
    this.agenciaDevolucao = agenciaDevolucao;
  }

  public Veiculo getVeiculo() {
    return veiculo;
  }

  public void trocarVeiculoAlugado(Veiculo veiculo) {
    this.veiculo = veiculo;
  }

  public String getDataRetirada() {
    return dataRetirada;
  }

  public void alterarDataDeRetirada(String dataRetirada) {

    //IMPLEMENTAR
    this.dataRetirada = dataRetirada;
  }

  public String getDataDevolucao() {
    return dataDevolucao;
  }

  public void AlterarDataDeDevolucao(String dataDevolucao) {
    //IMPLEMENTAR
    this.dataDevolucao = dataDevolucao;
  }

  public Boolean encerrarAluguel(){
    if (encerrado == true) return false;
    encerrado = !encerrado;
    return true;
  }

  @Override
  public String getID() {
    return String.valueOf(id);
  }
  
}
