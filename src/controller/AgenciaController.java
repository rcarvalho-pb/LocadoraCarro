package controller;

import model.Agencia;
import repository.AbstractRepositoryEmMemoria;
import repository.AgenciaRepository;

public class AgenciaController {
  
  private final AgenciaRepository agenciaRepository;

  public AgenciaController(AgenciaRepository agenciaRepository) {
    this.agenciaRepository = agenciaRepository;
  }  
}
