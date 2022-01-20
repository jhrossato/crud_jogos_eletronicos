package Controller;

import View.GerenciarEstoqueView;
import View.MenuVendedorView;

public class MenuVendedorViewController {
    private MenuVendedorView view;

    public MenuVendedorViewController(MenuVendedorView view) {
        this.view = view;
    }
    
    public void gerenciarEstoque() {
      GerenciarEstoqueView gerenciarEstoque = new GerenciarEstoqueView();
      gerenciarEstoque.setVisible(true);     
    }
    public void carrinhoDeCompras() {
           
    }
    public void sairLogOut() {
           
    }
       
}