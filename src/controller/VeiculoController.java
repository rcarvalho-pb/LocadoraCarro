package controller;

import exceptions.RegistroEmDuplicidadeException;
import model.veiculo.Veiculo;
import model.veiculo.VeiculoCaminhao;
import model.veiculo.VeiculoCarro;
import model.veiculo.VeiculoMoto;
import repository.VeiculoRepository;
import util.CapturadorDeEntrada;

import java.util.List;

public class VeiculoController<T extends Veiculo> {
  
  private final VeiculoRepository veiculoRepository;

  public VeiculoController (VeiculoRepository veiculoRepository) {
    this.veiculoRepository = veiculoRepository;
  }

  public Veiculo cadastrarNovoCarro(String modelo, String fabricante, String cor, String placa){
    if(existeVeiculo(placa)) throw new RegistroEmDuplicidadeException("CARRO", placa);

    Veiculo veiculo = new VeiculoCarro(modelo, fabricante, cor, placa);
    veiculoRepository.salvar(veiculo);
    return veiculo;
  }

  public Veiculo cadastrarNovaMoto(String modelo, String fabricante, String cor, String placa){
    if(existeVeiculo(placa)) throw new RegistroEmDuplicidadeException("MOTO", placa);

    Veiculo veiculo = new VeiculoMoto(modelo, fabricante, cor, placa);
    veiculoRepository.salvar(veiculo);
    return veiculo;
  }

  public Veiculo cadastrarNovoCaminhao(String modelo, String fabricante, String cor, String placa){
    if(existeVeiculo(placa)) throw new RegistroEmDuplicidadeException("CAMINHAO", placa);

    Veiculo veiculo = new VeiculoCaminhao(modelo, fabricante, cor, placa);
    veiculoRepository.salvar(veiculo);
    return veiculo;
  }

  public Boolean existeVeiculo(String placa){
    return veiculoRepository.buscarPeloID(placa) != null;
  }

  public List<Veiculo> buscarVeiculoPeloModelo(String placa){
    return veiculoRepository.buscarVeiculoPeloModelo(placa);
  }

  public Veiculo selecionarVeiculo(List<Veiculo> veiculos) {
    veiculos.forEach(System.out::println);
    String placa = CapturadorDeEntrada.capturarString("Informe a placa do veiculo: ");
    return veiculos.stream()
                  .filter(v -> v.getID().equals(placa))
                  .findAny()
                  .orElse(null);
  }
  
}
