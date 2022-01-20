package Controller;

import DAO.UsuarioDAO;
import View.CadastroView;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class CadastroControl {
    private CadastroView view;
    Connection connection;
    UsuarioDAO usuarioCadastrar;
    
    public CadastroControl(CadastroView view){
        this.view = view;
    }

    public void cadastrarUsuario(String checkBox) {
        usuarioCadastrar = new UsuarioDAO();
        usuarioCadastrar.usuario.setTipo(checkBox);
        usuarioCadastrar.usuario.setLogin(view.getjTextFieldCadastrarLogin().getText());
        usuarioCadastrar.usuario.setSenha(view.getjTextFieldCadastrarSenha().getText());
        usuarioCadastrar.usuario.setNome(view.getjTextFieldCadastrarNome().getText());
        usuarioCadastrar.usuario.setCpf(view.getjTextFieldCadastrarCPF().getText());
        usuarioCadastrar.usuario.setDataDeNascimento(view.getjTextFieldDataDeNascimento().getText());
        usuarioCadastrar.usuario.setEmail(view.getjTextFieldCadastrarEmail().getText());
        usuarioCadastrar.usuario.setEndereco(view.getjTextFieldCadastrarEndereco().getText());
        if(usuarioCadastrar.cadastrarUsuario()){
            view.dispose();
            JOptionPane.showMessageDialog(view, "Usuario cadastrado com exito!");
        }else{
            JOptionPane.showMessageDialog(view, "Erro ao cadastrar");
        }
    }
}
