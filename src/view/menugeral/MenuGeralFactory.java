package view.menugeral;

import view.MenuComSubmenus;
import view.MenuFactory;
import view.agencia.MenuAgenciaFactory;
import view.aluguel.MenuAluguelFactory;
import view.cliente.MenuClienteFactory;
import view.devolucao.MenuDevolucaoFactory;
import view.veiculo.MenuVeiculoFactory;
import view.Menu;

public class MenuGeralFactory implements MenuFactory {

  private final MenuClienteFactory menuClienteFactory;
  private final MenuVeiculoFactory menuVeiculoFactory;
  private final MenuAgenciaFactory menuAgenciaFactory;
  private final MenuAluguelFactory menuAluguelFactory;
  private final MenuDevolucaoFactory menuDevolucaoFactory;

  public MenuGeralFactory(MenuClienteFactory menuClienteFactory, MenuVeiculoFactory menuVeiculoFactory, MenuAgenciaFactory menuAgenciaFactory, MenuAluguelFactory menuAluguelFactory, MenuDevolucaoFactory menuDevolucaoFactory){
    this.menuClienteFactory = menuClienteFactory;
    this.menuVeiculoFactory = menuVeiculoFactory;
    this.menuAgenciaFactory = menuAgenciaFactory;
    this.menuAluguelFactory = menuAluguelFactory;
    this.menuDevolucaoFactory = menuDevolucaoFactory;
  }

  @Override
  public Menu create() {
    MenuComSubmenus menuGeral = new MenuGeral("MENU GERAL");

    Menu menuSair = new MenuSair();
    menuGeral.adicionarSubmenus(menuSair);

    Menu menuCliente =  new MenuClienteFactory().create();
    menuGeral.adicionarSubmenus(menuCliente);

    Menu menuVeiculo = new MenuVeiculoFactory().create();
    menuGeral.adicionarSubmenus(menuVeiculo);

    Menu menuAgencia = new MenuAgenciaFactory().create();
    menuGeral.adicionarSubmenus(menuAgencia);

    Menu menuAluguel = new MenuAluguelFactory().create();
    menuGeral.adicionarSubmenus(menuAluguel);

    return menuGeral;
  }
  
}
