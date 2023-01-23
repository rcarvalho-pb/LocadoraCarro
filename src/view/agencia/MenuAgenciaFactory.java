package view.agencia;

import view.Menu;
import view.MenuComSubmenus;
import view.MenuFactory;

public class MenuAgenciaFactory implements MenuFactory {

  @Override
  public Menu create() {
    MenuComSubmenus menuAgencia = new MenuAgencia("MENU AGENCIA");

    return menuAgencia;
  }
  
}
