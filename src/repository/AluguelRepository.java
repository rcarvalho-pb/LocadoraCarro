package repository;

import java.util.List;

import model.Aluguel;

public interface AluguelRepository extends GenericRepository<Aluguel> {

  List<Aluguel> buscarAluguelPorCliente(String cliente);
  
}
