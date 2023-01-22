package repository;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Entidade;

public abstract class AbstractRepository<T extends Entidade> implements GenericRepository<T> {

  List<T> entidades = new ArrayList<>();

  @Override
  public boolean salvar(T entidade) {
    if (!entidades.contains(entidade)){
      entidades.add(entidade);
      return true;
    }

    return false;
  }

  @Override
  public boolean remover(T entidade) {
    if (entidades.contains(entidade)) {
      entidades.remove(entidade);
      return true;
    }
    return false;
  }

  @Override
  public T buscarPeloID(String identificador) {
    return entidades.get(Integer.valueOf(identificador));
  }

  @Override
  public List<T> listarTodos() {
    return (entidades);
  }

  
  
}
