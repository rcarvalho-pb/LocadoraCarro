package view.veiculoview;

import controller.VeiculoController;
import model.veiculo.Veiculo;
import util.CapturadorDeEntrada;
import view.MenuAbstrato;

public class MenuCadastrarMoto extends MenuAbstrato {
    private final VeiculoController veiculoController;
    public MenuCadastrarMoto(VeiculoController veiculoController) {
        super("CADASTRAR NOVO CARRO");
        this.veiculoController = veiculoController;
    }

    @Override
    protected void acao() {
        String placa = CapturadorDeEntrada.capturarString("Informe a placa da nova Moto: ");
        while(veiculoController.existeVeiculo(placa)){
            System.out.println("Moto já cadastrado. Tente novamente.");
            placa = CapturadorDeEntrada.capturarString("Informe a placa da nova Moto: ");
        }
        String modelo = CapturadorDeEntrada.capturarString("Informe o modelo da Moto: ");
        String fabricante = CapturadorDeEntrada.capturarString("Informe o fabricante da Moto: ");
        String cor = CapturadorDeEntrada.capturarString("Informe a cor da Moto:");

        Veiculo veiculo = veiculoController.cadastrarNovaMoto(modelo, fabricante, cor, placa);
        System.out.println("Nova Moto cadastrado. \nMoto: ");
        System.out.println(veiculo);
    }
}