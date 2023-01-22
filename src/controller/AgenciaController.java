package controller;

import repository.AgenciaRepository;
import repository.RepositoryInterface;

public class AgenciaController {
  
  private final RepositoryInterface agenciaRepository;

  public AgenciaController(AgenciaRepository agenciaRepository) {
    this.agenciaRepository = agenciaRepository;
  }

  
}
