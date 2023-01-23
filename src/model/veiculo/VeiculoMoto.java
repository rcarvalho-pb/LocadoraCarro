package model.veiculo;

import java.math.BigDecimal;

public class VeiculoMoto extends Veiculo {

  public VeiculoMoto(String modelo, String fabricante, String cor, String placa) {
    super(modelo, fabricante, cor, placa);
    diaria = new BigDecimal("100.00");
  }
  
}
