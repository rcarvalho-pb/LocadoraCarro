package view.menugeral;

import view.Menu;
import view.MenuComSubmenus;
import view.MenuFactory;
import view.agencia.MenuAgenciaFactory;
import view.aluguel.MenuAluguelFactory;
import view.cliente.MenuClienteFactory;
import view.veiculoview.MenuVeiculoFactory;

public class MenuGeralFactory implements MenuFactory {

  private final MenuClienteFactory menuClienteFactory;
  private final MenuVeiculoFactory menuVeiculoFactory;
  private final MenuAgenciaFactory menuAgenciaFactory;
  private final MenuAluguelFactory menuAluguelFactory;

  public MenuGeralFactory(MenuClienteFactory menuClienteFactory, MenuVeiculoFactory menuVeiculoFactory, MenuAgenciaFactory menuAgenciaFactory, MenuAluguelFactory menuAluguelFactory){
    this.menuClienteFactory = menuClienteFactory;
    this.menuVeiculoFactory = menuVeiculoFactory;
    this.menuAgenciaFactory = menuAgenciaFactory;
    this.menuAluguelFactory = menuAluguelFactory;
  }

  @Override
  public Menu create() {
    MenuComSubmenus menuGeral = new MenuGeral("MENU GERAL");

    Menu menuSair = new MenuSair();
    menuGeral.adicionarSubmenus(menuSair);

    Menu menuVeiculos = menuVeiculoFactory.create();
    menuGeral.adicionarSubmenus(menuVeiculos);

    Menu menuAgencias = menuAgenciaFactory.create();
    menuGeral.adicionarSubmenus(menuAgencias);

    Menu menuClientes = menuClienteFactory.create();
    menuGeral.adicionarSubmenus(menuClientes);

    Menu menuAlugueis = menuAluguelFactory.create();
    menuGeral.adicionarSubmenus(menuAlugueis);

    return menuGeral;
  }
  
}
