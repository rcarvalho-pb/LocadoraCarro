package view.veiculo;

import view.Menu;
import view.MenuComSubmenus;
import view.MenuFactory;

public class MenuVeiculoFactory implements MenuFactory {

  @Override
  public Menu create() {
    MenuComSubmenus menuVeiculo = new MenuVeiculo("MENU VEICULO");


    return menuVeiculo;
  }
  
}
