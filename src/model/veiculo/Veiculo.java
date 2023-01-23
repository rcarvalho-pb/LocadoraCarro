package model.veiculo;

import java.math.BigDecimal;

import model.Entidade;

public abstract class Veiculo implements Entidade {

  String modelo;
  String fabricante;
  String cor;
  String placa;
  Boolean disponibilidade;  
  BigDecimal diaria;

  public Veiculo(String modelo, String fabricante, String cor, String placa) {
    this.modelo = modelo;
    this.fabricante = fabricante;
    this.cor = cor;
    this.placa = placa;
    disponibilidade = true;
  }

  public String getModelo() {
    return modelo;
  }

  public String getFabricante() {
    return fabricante;
  }

  public String getCor() {
    return cor;
  }

  public Boolean alugarVeiculo() {
    if (disponibilidade == false) {
      return false;
    }
    disponibilidade = !disponibilidade;
    return true;
  }

  public Boolean devolverVeiculo() {
    if (disponibilidade == true) {
      return false;
    }
    disponibilidade = !disponibilidade;
    return true;
  }

  public BigDecimal getDiaria() {
    return diaria;
  }

  public void setDiaria(BigDecimal diaria) {
    this.diaria = diaria;
  }

  @Override
  public String getID() {
    return placa;
  }
  
}
