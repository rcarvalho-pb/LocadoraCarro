package repository;

import java.util.List;

import model.veiculo.Veiculo;

public interface VeiculoRepository extends GenericRepository<Veiculo> {

    List<Veiculo> buscarVeiculoPorModelo(String modelo);

    List<Veiculo> buscarVeiculoPelaPlaca(String placa);
}
