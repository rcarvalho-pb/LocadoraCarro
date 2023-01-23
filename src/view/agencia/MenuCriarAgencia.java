package view.agencia;

import controller.AgenciaController;
import util.CapturadorDeEntrada;
import view.MenuAbstrato;

public class MenuCriarAgencia extends MenuAbstrato {

  private final AgenciaController agenciaController;

  public MenuCriarAgencia(AgenciaController agenciaController) {
    super("ADICIONAR AGENCIA");
    this.agenciaController = agenciaController;
  }

  @Override
  protected void acao() {
    String nome = CapturadorDeEntrada.capturarString("Nome da nova agencia: ");

    
  }
  
}
