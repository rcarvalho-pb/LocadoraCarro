package view.menugeral;

import util.CapturadorDeEntrada;
import view.MenuAbstrato;

public class MenuSair extends MenuAbstrato {

  public MenuSair() {
    super("MENU SAIR");
    //TODO Auto-generated constructor stub
  }

  @Override
  protected void acao() {
    System.out.println("Encerrando. ");
    CapturadorDeEntrada.encerrarCapturador();
    System.exit(0);
    
  }
  
}
