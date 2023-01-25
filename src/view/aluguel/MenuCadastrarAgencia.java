package view.aluguel;

import view.MenuAbstrato;
import controller.AgenciaController;
import model.Agencia;
import util.CapturadorDeEntrada;

public class MenuCadastrarAgencia extends MenuAbstrato {

  private final AgenciaController agenciaController;

  public MenuCadastrarAgencia(AgenciaController agenciaController) {
    super("ALTERAR AGENCIA DE RETIRADA");
    this.agenciaController = agenciaController;
  }

  @Override
  protected void acao() {
    
    String nome = CapturadorDeEntrada.capturarString("Informe o nome da agencia: ");
    while(agenciaController.existeAgencia(nome)) {
      System.out.println("Agencia já cadastrada. Tente novamente");
      nome = CapturadorDeEntrada.capturarString("Informe o nome da agencia: ");
    }
    String logradouro = CapturadorDeEntrada.capturarString("Informe o logradouro da agencia: ");

    Agencia agencia = agenciaController.criarAgencia(nome, logradouro);
    System.out.println("Agencia cadastrada com sucesso.\nAgencia: ");
    System.out.println(agencia);
  }
  
}
