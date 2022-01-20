package Controller;

import DAO.ProdutoDAO;
import View.GerenciarEstoqueView;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class GerenciarEstoqueControl {
    private final GerenciarEstoqueView view;
    ProdutoDAO produtos;
    JTable tabela = new JTable();
    
    
    public GerenciarEstoqueControl(GerenciarEstoqueView view) {
        this.view = view;
    }
        
    public void inserirSubMenuView(String categoria){
        produtos = new ProdutoDAO();
        produtos.produto.setCategoria(categoria);
        if(GetSubMenuDados()){
            if(produtos.inserirProduto()){
                LimpaSubMenuDados();
                JOptionPane.showMessageDialog(null, "Produto inserido com sucesso!");
            }
        }
    }
       
    private boolean GetSubMenuDados(){
        produtos.produto.setNome(view.getjTextFieldNome().getText());
        produtos.produto.setValor(Float.parseFloat(view.getjTextFieldPreco().getText()));
        produtos.produto.setDescricao(view.getjTextFieldDescricao().getText());
        produtos.produto.setQuantidade(Integer.parseInt(view.getjTextFieldQuantidade().getText()));
        return true;
    }
    
    private void LimpaSubMenuDados(){
        view.getjTextFieldNome().setText("");
        view.getjTextFieldDescricao().setText("");
        view.getjTextFieldPreco().setText("");
        view.getjTextFieldQuantidade().setText("");
    }
    
    private boolean GetId(){
        if(!"".equals(view.getjTextFieldId().getText())){
            produtos.produto.setId(Integer.parseInt(view.getjTextFieldId().getText()));
            return true;
        }
        else
            return false;
    }
}