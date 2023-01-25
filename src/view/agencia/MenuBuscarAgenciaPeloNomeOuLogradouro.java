package view.agencia;

import java.util.List;

import controller.AgenciaController;
import exceptions.RegistroEmDuplicidadeException;
import model.Agencia;
import util.CapturadorDeEntrada;
import view.MenuAbstrato;

public class MenuBuscarAgenciaPeloNomeOuLogradouro extends MenuAbstrato {

  private final AgenciaController agenciaController;

  public MenuBuscarAgenciaPeloNomeOuLogradouro(AgenciaController agenciaController) {
    super("BUSCAR AGENCIA PELO NOME");
    this.agenciaController = agenciaController;
  }

  @Override
  protected void acao() {
    String nome = CapturadorDeEntrada.capturarString("Informe parte do nome ou logradouro da Agencia: ");
    List<Agencia> agencias = agenciaController.buscarAgenciaPeloNomeOuLogradouro(nome);
    agencias.forEach(System.out::println);
    
  }
  
}
