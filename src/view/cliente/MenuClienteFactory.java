package view.cliente;

import controller.ClienteController;
import view.Menu;
import view.MenuComSubmenus;
import view.MenuFactory;
import view.menugeral.MenuVoltar;

public class MenuClienteFactory implements MenuFactory {

  private final ClienteController clienteController;

  public MenuClienteFactory(ClienteController clienteController) {
    this.clienteController = clienteController;
  }

  @Override
  public Menu create() {
    MenuComSubmenus menuCliente = new MenuCliente();

    Menu voltar = new MenuVoltar();
    menuCliente.adicionarSubmenus(voltar);

    MenuComSubmenus menuCadastrarCliente = new MenuCadastrarCliente();
    Menu menuCadastarPF = new MenuCadastrarClientePessoaFisica(clienteController);
    menuCadastrarCliente.adicionarSubmenus(menuCadastarPF);
    Menu menuCadastarPJ = new MenuCadastrarClientePessoaJuridica(clienteController);
    menuCadastrarCliente.adicionarSubmenus(menuCadastarPJ);
    menuCliente.adicionarSubmenus(menuCadastrarCliente);
    
    return menuCliente;
  }
  
}
