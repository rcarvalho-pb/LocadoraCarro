package view.veiculoview;

import controller.VeiculoController;
import model.veiculo.Veiculo;
import util.CapturadorDeEntrada;
import view.MenuAbstrato;

public class MenuCadastrarCarro extends MenuAbstrato {
    private final VeiculoController veiculoController;
    public MenuCadastrarCarro(VeiculoController veiculoController) {
        super("CADASTRAR NOVO CARRO");
        this.veiculoController = veiculoController;
    }

    @Override
    protected void acao() {
        String placa = CapturadorDeEntrada.capturarString("Informe a placa do novo Carro: ");
        while(veiculoController.existeVeiculo(placa)){
            System.out.println("Carro já cadastrado. Tente novamente.");
            placa = CapturadorDeEntrada.capturarString("Informe a placa do novo Carro: ");
        }
        String modelo = CapturadorDeEntrada.capturarString("Informe o modelo do Carro: ");
        String fabricante = CapturadorDeEntrada.capturarString("Informe o fabricante do Carro: ");
        String cor = CapturadorDeEntrada.capturarString("Informe a cor do Carro:");

        Veiculo veiculo = veiculoController.cadastrarNovoCarro(modelo, fabricante, cor, placa);
        System.out.println("Novo Carro cadastrado. \nCarro: ");
        System.out.println(veiculo);
    }
}
