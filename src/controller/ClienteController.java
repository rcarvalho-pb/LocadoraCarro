package controller;

import repository.ClienteRepository;

public class ClienteController {
  private final ClienteRepository clienteRepository;

  public ClienteController (ClienteRepository clienteRepository) {
    this.clienteRepository = clienteRepository;
  }
}
