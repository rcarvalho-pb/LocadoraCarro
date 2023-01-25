package exceptions;

public class BuscaInexistenteException extends RuntimeException {

  public BuscaInexistenteException(String tipoDoRegistro, String valorDoID) {
    super("Não foi encontrado(a) um(a) %s com o valor informado. ".formatted(tipoDoRegistro, valorDoID));
  }
  
}
