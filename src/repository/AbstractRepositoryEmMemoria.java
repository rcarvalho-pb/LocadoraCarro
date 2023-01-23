package repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Entidade;

public abstract class AbstractRepositoryEmMemoria<T extends Entidade> implements GenericRepository<T> {

  protected List<T> entidades = new ArrayList<>();

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
    return entidades.stream()
                    .filter(e -> e.getID().equals(identificador))
                    .findAny()
                    .orElse(null);
  }

  @Override
  public List<T> listarTodos() {
    return Collections.unmodifiableList(entidades);
  }

  public List<T> getEntidades(){
    return Collections.unmodifiableList(entidades);
  }
  
}
