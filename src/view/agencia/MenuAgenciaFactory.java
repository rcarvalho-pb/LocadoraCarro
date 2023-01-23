package view.agencia;

import repository.AgenciaRepository;
import view.Menu;
import view.MenuAbstrato;
import view.MenuComSubmenus;
import view.MenuFactory;

public class MenuAgenciaFactory implements MenuFactory {

  private final AgenciaRepository agenciaRepository;

  public MenuAgenciaFactory(AgenciaRepository agenciaRepository) {
    this.agenciaRepository = agenciaRepository;
  }

  @Override
  public Menu create() {
    MenuComSubmenus menuAgencia = new MenuAgencia("MENU AGENCIA");

    MenuAbstrato menuCriarAgencia = new MenuCriarAgencia();

    return menuAgencia;
  }
  
}
