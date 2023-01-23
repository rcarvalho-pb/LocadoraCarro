package view.veiculoview;

import controller.VeiculoController;
import model.veiculo.Veiculo;
import util.CapturadorDeEntrada;
import view.MenuAbstrato;

public class MenuCadastrarCaminhao extends MenuAbstrato {
    private final VeiculoController veiculoController;
    public MenuCadastrarCaminhao(VeiculoController veiculoController) {
        super("CADASTRAR NOVO CARRO");
        this.veiculoController = veiculoController;
    }

    @Override
    protected void acao() {
        String placa = CapturadorDeEntrada.capturarString("Informe a placa do novo Caminhão: ");
        while(veiculoController.existeVeiculo(placa)){
            System.out.println("Caminhão já cadastrado. Tente novamente.");
            placa = CapturadorDeEntrada.capturarString("Informe a placa do novo Caminhão: ");
        }
        String modelo = CapturadorDeEntrada.capturarString("Informe o modelo do Caminhão: ");
        String fabricante = CapturadorDeEntrada.capturarString("Informe o fabricante do Caminhão: ");
        String cor = CapturadorDeEntrada.capturarString("Informe a cor do Caminhão:");

        Veiculo veiculo = veiculoController.cadastrarNovoCaminhao(modelo, fabricante, cor, placa);
        System.out.println("Novo Carro cadastrado. \nCaminhão: ");
        System.out.println(veiculo);
    }
}