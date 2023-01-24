package view.veiculoview;

import controller.VeiculoController;
import model.veiculo.Veiculo;
import model.veiculo.VeiculoCarro;
import util.CapturadorDeEntrada;
import view.MenuAbstrato;

import java.util.List;

public class MenuAlterarVeiculo extends MenuAbstrato {
    private final VeiculoController veiculoController;
    public MenuAlterarVeiculo(VeiculoController veiculoController) {
        super("ALTERAR VEICULO");
        this.veiculoController = veiculoController;
    }

    @Override
    protected void acao() {
        String placa = CapturadorDeEntrada.capturarString("Informe a placa do veiculo: ");
        List<Veiculo> veiculosBuscadosPelaPlaca = veiculoController.buscarVeiculoPeloModelo(placa);
        Veiculo veiculo = veiculoController.selecionarVeiculo(veiculosBuscadosPelaPlaca);
        String modelo = CapturadorDeEntrada.capturarString("Informe o modelo do veiculo: ");
        String cor = CapturadorDeEntrada.capturarString("Informe a cor do veiculo: ");
        String fabricante = CapturadorDeEntrada.capturarString("Informe o fabricante do veiculo: ");

        veiculo.alterarModelo(modelo);
        veiculo.alterarCor(cor);
        veiculo.alterarFabricante(fabricante);

        System.out.println("Dados Atualizados. \nVeiculo: ");
        System.out.println(veiculo);
    }
}
