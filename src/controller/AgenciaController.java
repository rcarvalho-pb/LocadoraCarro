package controller;

import java.util.List;

import exceptions.BuscaInexistenteException;
import exceptions.RegistroEmDuplicidadeException;
import model.Agencia;
import repository.AgenciaRepository;
import util.CapturadorDeEntrada;

public class AgenciaController {
  
  private final AgenciaRepository agenciaRepository;

  public AgenciaController(AgenciaRepository agenciaRepository) {
    this.agenciaRepository = agenciaRepository;
  }  

  public Agencia criarAgencia(String nome, String logradouro) {
    if (existeAgencia(nome)) throw new RegistroEmDuplicidadeException("AGENCIA", nome);

    Agencia agencia = new Agencia(nome, logradouro);
    agenciaRepository.salvar(agencia);
    return agencia;
  }

  public Boolean existeAgencia(String nome) {
    return agenciaRepository.buscarPeloID(nome) != null;
  }

  public List<Agencia> buscarAgenciaPeloNomeOuLogradouro(String nomeLogradouro){
    
    List<Agencia> agenciasEncontradas = agenciaRepository.buscarPeloNomeOuLogradouro(nomeLogradouro);
    if (agenciasEncontradas == null) throw new BuscaInexistenteException("AGENCIA", nomeLogradouro);
    return agenciasEncontradas;
  }

  private Agencia selecionarAgencia(List<Agencia> agenciasEncontradas) {
    String nome = CapturadorDeEntrada.capturarString("Informe o nome da agencia: ");
    
    return agenciasEncontradas.stream()
                              .filter(a -> a.getID().equals(nome))
                              .findAny()
                              .orElse(null);
  }
}
