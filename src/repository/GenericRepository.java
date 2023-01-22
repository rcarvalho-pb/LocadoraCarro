package repository;

import java.util.ArrayList;
import java.util.List;

public interface GenericRepository<T> {
  
  boolean salvar(T entidade);
  boolean remover(T entidade);
  T buscarPeloID(String identificador);
  List<T> listarTodos();
}
