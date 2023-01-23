package repository;

import java.util.List;

import model.Agencia;

public class AgenciaRepositoryEmMemoria extends AbstractRepositoryEmMemoria<Agencia> implements AgenciaRepository {

  @Override
  public List<Agencia> buscarPeloNomeOuLogradouro(String nomeOuLogradouro) {
      return entidades.stream()
                      .filter(agencia -> agencia.getNome().contains(nomeOuLogradouro)  || agencia.getLogradouro().contains(nomeOuLogradouro))
                      .toList();
    
  }

  
}
