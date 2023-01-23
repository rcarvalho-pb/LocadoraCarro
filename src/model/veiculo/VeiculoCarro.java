package model.veiculo;

import java.math.BigDecimal;

public class VeiculoCarro extends Veiculo {

  public VeiculoCarro(String modelo, String fabricante, String cor, String placa) {
    super(modelo, fabricante, cor, placa);
    diaria = new BigDecimal("150.00");
  }
  
}
