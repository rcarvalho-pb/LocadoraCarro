package repository;

import java.util.List;

import model.Agencia;

public class AgenciaRepositoryEmMemoria extends AbstractRepositoryEmMemoria<Agencia> implements AgenciaRepository {

  @Override
  public List<Agencia> buscarPeloNomeOuLogradouro(String entrada) {
      return entidades.stream()
                      .filter(agencia -> agencia.getLogradouro().contains(entrada) || agencia.getID().contains(entrada))
                      .toList();
    
  }

  
}
