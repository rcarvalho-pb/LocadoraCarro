package repository;

import java.util.List;

import model.cliente.Cliente;

public class ClienteRepositoryEmMemoria extends AbstractRepositoryEmMemoria<Cliente> implements ClienteRepository {

  @Override
  public List<Cliente> buscarClientePeloNome(String nome) {
    return entidades.stream()
                    .filter(c -> c.getID().contains(nome))
                    .toList();
  }
  
}
