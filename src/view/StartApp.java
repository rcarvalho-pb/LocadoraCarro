package view;

import controller.AgenciaController;
import controller.AluguelController;
import controller.ClienteController;
import controller.VeiculoController;
import repository.*;
import view.agencia.MenuAgenciaFactory;
import view.aluguel.MenuAluguelFactory;
import view.cliente.MenuClienteFactory;
import view.menugeral.MenuGeralFactory;
import view.veiculoview.MenuVeiculoFactory;

public class StartApp {

    public static void start(){
        AgenciaRepository agenciaRepository = new AgenciaRepositoryEmMemoria();
        AgenciaController agenciaController = new AgenciaController(agenciaRepository);
        MenuAgenciaFactory menuAgenciaFactory = new MenuAgenciaFactory(agenciaController);

        ClienteRepository clienteRepository = new ClienteRepositoryEmMemoria();
        ClienteController clienteController = new ClienteController(clienteRepository);
        MenuClienteFactory menuClienteFactory = new MenuClienteFactory(clienteController);

        VeiculoRepository veiculoRepository = new VeiculoRepositoryEmMemoria();
        VeiculoController veiculoController = new VeiculoController(veiculoRepository);
        MenuVeiculoFactory menuVeiculoFactory = new MenuVeiculoFactory(veiculoController);

        AluguelRepository aluguelRepository = new AluguelRepositoryEmMemoria();
        AluguelController aluguelController = new AluguelController(aluguelRepository);
        MenuAluguelFactory menuAluguelFactory = new MenuAluguelFactory(aluguelController);

        Menu menuGeral = new MenuGeralFactory(menuClienteFactory, menuVeiculoFactory, menuAgenciaFactory,
                menuAluguelFactory).create();
        menuGeral.agir();

    }
}
