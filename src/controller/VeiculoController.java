package controller;

import exceptions.RegistroEmDuplicidadeException;
import model.veiculo.Veiculo;
import model.veiculo.VeiculoCaminhao;
import model.veiculo.VeiculoCarro;
import model.veiculo.VeiculoMoto;
import repository.VeiculoRepository;

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
    System.out.println("Nova Moto cadastrada. \nMoto: ");
    System.out.println(veiculo);

    return veiculo;
  }

  public Veiculo cadastrarNovoCaminhao(String modelo, String fabricante, String cor, String placa){
    if(existeVeiculo(placa)) throw new RegistroEmDuplicidadeException("CAMINHAO", placa);

    Veiculo veiculo = new VeiculoCaminhao(modelo, fabricante, cor, placa);
    veiculoRepository.salvar(veiculo);
    System.out.println("Novo Caminhão cadastrado. \nCaminhão: ");
    System.out.println(veiculo);

    return veiculo;
  }

  public Boolean existeVeiculo(String placa){
    return veiculoRepository.buscarPeloID(placa) != null;
  }

  public Veiculo buscarVeiculoPelaPlaca(String placa){
    List<Veiculo> veiculosBuscadosPelaPlaca = veiculoRepository.buscarVeiculoPelaPlaca(placa);

  }

  public Veiculo selecionarVeiculo(List<Veiculo> veiculos) {

  }
}
