package view.cliente;

import controller.ClienteController;
import model.cliente.Cliente;
import util.CapturadorDeEntrada;
import view.MenuAbstrato;

public class MenuCadastrarClientePessoaFisica extends MenuAbstrato {

  private final ClienteController clienteController;

  public MenuCadastrarClientePessoaFisica(ClienteController clienteController) {
    super("CADASTRAR CLIENTE PESSOA FISICA");
    this.clienteController = clienteController;
  }

  @Override
  protected void acao() {
    String documento = CapturadorDeEntrada.capturarString("Informe o documento do cliente: ");
    while (clienteController.existeCliente(documento)) {
      System.out.println("Cliente com documento já cadastrado. Tente novamente. ");
      documento = CapturadorDeEntrada.capturarString("Informe o documento do cliente: ");
    }

    String nome = CapturadorDeEntrada.capturarString("Informe o nome do cliente: ");
    
    Cliente cliente = clienteController.cadastrarPessoaFisica(nome, documento);
    System.out.println("Cliente cadastrado com sucesso. \nCliente: ");
    System.out.println(cliente);
    
  }
  
}
