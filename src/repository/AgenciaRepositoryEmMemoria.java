package repository;

import java.util.List;

import model.Agencia;

public class AgenciaRepositoryEmMemoria extends AbstractRepositoryEmMemoria<Agencia> implements AgenciaRepository {

  @Override
  public List<Agencia> buscarPeloLogradouro(String logradouro) {
      return entidades.stream()
                      .filter(agencia -> agencia.getLogradouro().contains(logradouro))
                      .toList();
    
  }

  
}
