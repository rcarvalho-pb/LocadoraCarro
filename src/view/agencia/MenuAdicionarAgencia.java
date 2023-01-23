package view.agencia;

import controller.AgenciaController;
import model.Agencia;
import util.CapturadorDeEntrada;
import view.MenuAbstrato;

public class MenuAdicionarAgencia extends MenuAbstrato {

  private final AgenciaController agenciaController;

  public MenuAdicionarAgencia(AgenciaController agenciaController) {
    super("ADICIONAR AGENCIA");
    this.agenciaController = agenciaController;
  }

  @Override
  protected void acao() {
    String nome = CapturadorDeEntrada.capturarString("Nome da nova agencia: ");
    while(agenciaController.existeAgencia(nome)){
      System.out.println("Agencia [%s] já existe. Tente novamente." + nome);
      nome = CapturadorDeEntrada.capturarString("Nome da nova agencia: ");
    }

    String logradouro = CapturadorDeEntrada.capturarString("Logradouro: ");
    Agencia agencia = agenciaController.criarAgencia(nome, logradouro);
    System.out.println("Agencia adicionado com sucesso. ");
    System.out.println("Agencia: ");
    System.out.println(agencia);
  }
  
}
