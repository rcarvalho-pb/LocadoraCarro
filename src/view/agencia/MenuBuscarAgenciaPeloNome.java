package view.agencia;

import controller.AgenciaController;
import view.MenuAbstrato;

public class MenuBuscarAgenciaPeloNome extends MenuAbstrato {

  private final AgenciaController agenciaController;

  public MenuBuscarAgenciaPeloNome(AgenciaController agenciaController) {
    super("BUSCAR AGENCIA PELO NOME");
    this.agenciaController = agenciaController;
  }

  @Override
  protected void acao() {
    // TODO Auto-generated method stub
    
  }
  
}
