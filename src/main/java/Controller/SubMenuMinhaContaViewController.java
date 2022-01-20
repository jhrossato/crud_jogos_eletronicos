/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UsuarioDAO;
import View.SubMenuMinhaContaView;
import javax.swing.JOptionPane;

public class SubMenuMinhaContaViewController {
    
    private SubMenuMinhaContaView view;
    UsuarioDAO usuarios;
    String UsuarioAtual;
    String SenhaAtual;
    

    public SubMenuMinhaContaViewController(SubMenuMinhaContaView view) {
        this.view = view;
        view.setVisible(true);
    }

    /*public void buscarSubMenuView(){
        usuarios = new UsuarioDAO();
        if(usuarios.buscarUsuario()){
            UsuarioDados();
            //JOptionPane.showMessageDialog(null, "Usuario Alterado com sucesso!");
        }
        
    }*/
    
    private void UsuarioDados(){
        view.getjTextFieldAlterarLogin().setText(usuarios.usuario.getLogin());
        //view.getjTextFieldCadastrarSenha().setText(usuarios.usuario.getSenha());
        /*view.getjTextFieldModelo().setText(produtos.produto.getModelo());
        view.getjTextFieldDescricao().setText(produtos.produto.getDescricao());
        view.getjTextFieldPreco().setText(String.valueOf(produtos.produto.getPreco()));
        view.getjTextFieldQuantidade().setText(String.valueOf(produtos.produto.getQuantidade()));*/
    }
    /*
    public void pegarUsuarioESenha(String usuario, String senha){
        UsuarioAtual = usuario;
        SenhaAtual = senha;
    }*/

    
    
}
