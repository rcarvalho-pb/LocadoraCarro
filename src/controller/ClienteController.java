package controller;

import model.cliente.Cliente;
import model.cliente.ClientePessoaFisica;
import repository.ClienteRepository;
import exceptions.*;

public class ClienteController {
  private final ClienteRepository clienteRepository;

  public ClienteController (ClienteRepository clienteRepository) {
    this.clienteRepository = clienteRepository;
  }

  public Cliente cadastrarPessoaFisica(String nome, String documento){
    if(existeCliente(documento)) throw new RegistroEmDuplicidadeException("CLIENTE PESSOA FISICA", documento);

    Cliente cliente = new ClientePessoaFisica(nome, documento);
    clienteRepository.salvar(cliente);
    return cliente;
  }
  
  public Cliente cadastrarPessoaJuridica(String nome, String documento) {
    if(existeCliente(documento)) throw new RegistroEmDuplicidadeException("CLIENTE PESSOA Juridica", documento);
    
    Cliente cliente = new ClientePessoaFisica(nome, documento);
    clienteRepository.salvar(cliente);
    return cliente;
  }
  
  public Boolean existeCliente(String documento) {
    return clienteRepository.buscarPeloID(documento) != null;
  }
}
