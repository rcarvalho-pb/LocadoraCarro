package view.aluguel;

import controller.AluguelController;
import view.Menu;
import view.MenuComSubmenus;
import view.MenuFactory;
import view.menugeral.MenuVoltar;

public class MenuAluguelFactory implements MenuFactory {
  private final AluguelController aluguelController;

  public MenuAluguelFactory(AluguelController aluguelController) {
    this.aluguelController = aluguelController;
  }


  @Override
  public Menu create() {
    MenuComSubmenus menuAluguel = new MenuAluguel();

    Menu voltar = new MenuVoltar();
    menuAluguel.adicionarSubmenus(voltar);



    return menuAluguel;
  }
  
}
