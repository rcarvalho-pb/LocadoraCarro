package view.aluguel;

import view.Menu;
import view.MenuComSubmenus;
import view.MenuFactory;

public class MenuAluguelFactory implements MenuFactory {

  

  @Override
  public Menu create() {
    MenuComSubmenus menuAluguel = new MenuAluguel("MENU ALUGUEL");

    return menuAluguel;
  }
  
}
