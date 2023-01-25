package view.veiculoview;

import controller.VeiculoController;
import view.Menu;
import view.MenuComSubmenus;
import view.MenuFactory;
import view.menugeral.MenuVoltar;

public class MenuVeiculoFactory implements MenuFactory {
  private final VeiculoController veiculoController;

  public MenuVeiculoFactory(VeiculoController veiculoController) {
    this.veiculoController = veiculoController;
  }

  @Override
  public Menu create() {
    MenuComSubmenus menuVeiculo = new MenuVeiculo();

    Menu voltar = new MenuVoltar();
    menuVeiculo.adicionarSubmenus(voltar);

    MenuComSubmenus menuCadastrarVeiculo = new MenuCadastrarVeiculo();
    Menu cadastrarCarro = new MenuCadastrarCarro(veiculoController);
    menuCadastrarVeiculo.adicionarSubmenus(cadastrarCarro);
    Menu cadastrarMoto = new MenuCadastrarMoto(veiculoController);
    menuCadastrarVeiculo.adicionarSubmenus(cadastrarMoto);
    Menu cadastrarCaminhao = new MenuCadastrarCaminhao(veiculoController);
    menuCadastrarVeiculo.adicionarSubmenus(cadastrarCaminhao);
    menuVeiculo.adicionarSubmenus(menuCadastrarVeiculo);
    
    Menu alterarVeiculo = new MenuAlterarVeiculo(veiculoController);
    menuVeiculo.adicionarSubmenus(alterarVeiculo);

    Menu buscarVeiculoPeloNome = new MenuBuscarVeiculoPeloNome(veiculoController);
    menuVeiculo.adicionarSubmenus(buscarVeiculoPeloNome);

    return menuVeiculo;
  }
  
}
