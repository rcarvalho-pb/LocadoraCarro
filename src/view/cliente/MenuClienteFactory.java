package view.cliente;

import controller.ClienteController;
import view.Menu;
import view.MenuComSubmenus;
import view.MenuFactory;

public class MenuClienteFactory implements MenuFactory {

  private final ClienteController clienteController;

  public MenuClienteFactory(ClienteController clienteController) {
    this.clienteController = clienteController;
  }

  @Override
  public Menu create() {
    MenuComSubmenus menuCliente = new MenuCliente("MENU CLIENTE");


    return menuCliente;
  }
  
}
