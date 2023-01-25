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
    MenuComSubmenus menuAgencia = new MenuAgencia();

    Menu voltar = new MenuVoltar();
    menuAgencia.adicionarSubmenus(voltar);

    MenuAbstrato menuAdicionarAgencia = new MenuAdicionarAgencia(agenciaController);
    menuAgencia.adicionarSubmenus(menuAdicionarAgencia);

    Menu menuBuscarAgenciaPeloNome = new MenuBuscarAgenciaPeloNome(agenciaController);
    menuAgencia.adicionarSubmenus(menuBuscarAgenciaPeloNome);



    return menuAgencia;
  }
  
}
