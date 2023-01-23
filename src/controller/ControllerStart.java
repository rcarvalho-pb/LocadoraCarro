package controller;

import repository.AgenciaRepository;
import repository.AgenciaRepositoryEmMemoria;
import repository.AluguelRepository;
import repository.AluguelRepositoryEmMemoria;
import repository.ClienteRepository;
import repository.ClienteRepositoryEmMemoria;
import repository.VeiculoRepository;
import repository.VeiculoRepositoryEmMemoria;

public class ControllerStart {
  public static void start(){
    AgenciaRepository agenciaRepository = new AgenciaRepositoryEmMemoria();
    AgenciaController agenciaController = new AgenciaController(agenciaRepository);

    ClienteRepository clienteRepository = new ClienteRepositoryEmMemoria();
    ClienteController clienteController = new ClienteController(clienteRepository);

    VeiculoRepository veiculoRepository = new VeiculoRepositoryEmMemoria();
    VeiculoController veiculoController = new VeiculoController(veiculoRepository);

    AluguelRepository aluguelRepository = new AluguelRepositoryEmMemoria();
    AluguelController aluguelController = new AluguelController(aluguelRepository);
  }
}
