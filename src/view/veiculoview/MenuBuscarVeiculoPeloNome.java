package view.veiculoview;

import java.lang.management.PlatformManagedObject;
import java.util.List;

import controller.VeiculoController;
import model.veiculo.Veiculo;
import util.CapturadorDeEntrada;
import view.MenuAbstrato;

public class MenuBuscarVeiculoPeloNome  extends MenuAbstrato {

  private final VeiculoController veiculoController;

  public MenuBuscarVeiculoPeloNome(VeiculoController veiculoController) {
    super("BUSCAR VEICULO PELO NOME");
    this.veiculoController = veiculoController;
  }

  @Override
  protected void acao() {
    String placa = CapturadorDeEntrada.capturarString("Informe o modelo do veiculo: ");
    List<Veiculo> veiculos = veiculoController.buscarVeiculoPeloModelo(placa);

    veiculos.forEach(System.out::println);    
  }
  
}
