package view.devolucao;

import view.Menu;
import view.MenuComSubmenus;
import view.MenuFactory;

public class MenuDevolucaoFactory implements MenuFactory {

  @Override
  public Menu create() {
    MenuComSubmenus menuDevolucao = new MenuDevolucao("MENU DEVOLUCAO");

    return menuDevolucao;
  }
  
}
