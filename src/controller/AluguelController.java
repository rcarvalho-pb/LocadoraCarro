package controller;

import repository.AluguelRepository;

public class AluguelController {

  private final AluguelRepository aluguelRepository;

  public AluguelController(AluguelRepository aluguelRepository) {
    this.aluguelRepository = aluguelRepository;
  }
  
}
