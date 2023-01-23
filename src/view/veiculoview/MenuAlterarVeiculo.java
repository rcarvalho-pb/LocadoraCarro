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
        List<Veiculo> veiculosBuscadosPelaPlaca = veiculoController.buscarVeiculoPelaPlaca(placa);


        System.out.println("Dados Atualizados. ");
    }
}
