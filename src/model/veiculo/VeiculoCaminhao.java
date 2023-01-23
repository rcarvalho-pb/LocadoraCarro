package model.veiculo;

import java.math.BigDecimal;

public class VeiculoCaminhao extends Veiculo {

  public VeiculoCaminhao(String modelo, String fabricante, String cor, String placa) {
    super(modelo, fabricante, cor, placa);
    diaria = new BigDecimal("200.00");
  }
  
}
