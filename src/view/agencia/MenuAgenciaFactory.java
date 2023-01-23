package view.agencia;

import controller.AgenciaController;
import view.Menu;
import view.MenuAbstrato;
import view.MenuComSubmenus;
import view.MenuFactory;
import view.menugeral.MenuVoltar;

public class MenuAgenciaFactory implements MenuFactory {

  private final AgenciaController agenciaController;

  public MenuAgenciaFactory(AgenciaController agenciaController) {

    this.agenciaController = agenciaController;
  }

  @Override
  public Menu create() {
    MenuComSubmenus menuAgencia = new MenuAgencia("MENU AGENCIA");

    Menu voltar = new MenuVoltar();
    menuAgencia.adicionarSubmenus(voltar);

    MenuAbstrato menuCriarAgencia = new MenuAdicionarAgencia(agenciaController);
    menuAgencia.adicionarSubmenus(menuCriarAgencia);

    return menuAgencia;
  }
  
}
