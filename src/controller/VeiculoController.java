package controller;

import repository.VeiculoRepository;

public class VeiculoController {
  
  private final VeiculoRepository veiculoRepository;

  public VeiculoController (VeiculoRepository veiculoRepository) {
    this.veiculoRepository = veiculoRepository;
  }
}
