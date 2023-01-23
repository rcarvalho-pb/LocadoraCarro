package repository;

import java.util.List;

import model.Aluguel;

public class AluguelRepositoryEmMemoria extends AbstractRepositoryEmMemoria<Aluguel> implements AluguelRepository {

  @Override
  public List<Aluguel> buscarAluguelPorCliente(String cliente) {
    return entidades.stream()
                    .filter(a -> a.getCliente().getNome().contains(cliente))
                    .toList();
  }
  
}
