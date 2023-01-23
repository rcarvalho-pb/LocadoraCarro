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

    Menu cadastrarCarro = new MenuCadastrarCarro(veiculoController);
    menuVeiculo.adicionarSubmenus(cadastrarCarro);

    Menu cadastrarMoto = new MenuCadastrarMoto(veiculoController);
    menuVeiculo.adicionarSubmenus(cadastrarMoto);

    Menu cadastrarCaminhao = new MenuCadastrarCaminhao(veiculoController);
    menuVeiculo.adicionarSubmenus(cadastrarCaminhao);
    return menuVeiculo;
  }
  
}
