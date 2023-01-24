package controller;

import exceptions.RegistroEmDuplicidadeException;
import model.Agencia;
import repository.AgenciaRepository;

public class AgenciaController {
  
  private final AgenciaRepository agenciaRepository;

  public AgenciaController(AgenciaRepository agenciaRepository) {
    this.agenciaRepository = agenciaRepository;
  }  

  public Agencia criarAgencia(String nome, String logradouro) {
    if (existeAgencia(nome)) throw new RegistroEmDuplicidadeException("AGENCIA", nome);

    Agencia agencia = new Agencia(nome, logradouro);
    agenciaRepository.salvar(agencia);
    return agencia;
  }

  public Boolean existeAgencia(String nome) {
    return agenciaRepository.buscarPeloID(nome) != null;
  }
}
