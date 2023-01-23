package repository;

import java.util.List;

import model.cliente.Cliente;

public interface ClienteRepository extends GenericRepository<Cliente> {
  
  List<Cliente> buscarClientePeloNome(String nome);
}
