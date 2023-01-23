package view.cliente;

import view.Menu;
import view.MenuComSubmenus;
import view.MenuFactory;

public class MenuClienteFactory implements MenuFactory {

  @Override
  public Menu create() {
    MenuComSubmenus menuCliente = new MenuCliente("MENU CLIENTE");


    return menuCliente;
  }
  
}
