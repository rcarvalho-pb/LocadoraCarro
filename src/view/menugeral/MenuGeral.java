package view.menugeral;

import view.MenuComSubmenus;

public class MenuGeral extends MenuComSubmenus {

  public MenuGeral(String descricao) {
    super(descricao);
  }

  @Override
  public void acao(){
    super.acao();
    this.agir();
  }
  
}
