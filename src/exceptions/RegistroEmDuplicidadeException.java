package exceptions;

public class RegistroEmDuplicidadeException extends RuntimeException {
  public RegistroEmDuplicidadeException(String tipoDoRegistro, String valorDoID) {
    super("Já existe um(a) %s com o id %s".formatted(tipoDoRegistro, valorDoID));
  }
}
