package view.aluguel;

import controller.AluguelController;
import view.Menu;
import view.MenuComSubmenus;
import view.MenuFactory;

public class MenuAluguelFactory implements MenuFactory {
  private final AluguelController aluguelController;

  public MenuAluguelFactory(AluguelController aluguelController) {
    this.aluguelController = aluguelController;
  }


  @Override
  public Menu create() {
    MenuComSubmenus menuAluguel = new MenuAluguel("MENU ALUGUEL");

    return menuAluguel;
  }
  
}
