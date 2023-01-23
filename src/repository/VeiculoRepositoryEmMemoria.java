package repository;

import java.util.List;

import model.veiculo.Veiculo;

public class VeiculoRepositoryEmMemoria extends AbstractRepositoryEmMemoria<Veiculo> implements VeiculoRepository {

  @Override
  public List<Veiculo> buscarVeiculoPorModelo(String modelo) {
    return entidades.stream()
                    .filter(v -> v.getModelo().contains(modelo))
                    .toList();
  }
  
}
