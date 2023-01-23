package repository;

import java.util.List;

import model.Agencia;

public interface AgenciaRepository extends GenericRepository<Agencia> {

  List<Agencia> buscarPeloNomeOuLogradouro(String nomeOuLogradouro);
  
}
