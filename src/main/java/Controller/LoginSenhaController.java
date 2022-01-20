package Controller;

import DAO.UsuarioDAO;
import View.LoginSenhaView;
import View.SubMenuMinhaContaView;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class LoginSenhaController {
    private LoginSenhaView view;
    Connection connection;
    UsuarioDAO usuarioAutenticar;
    
    public LoginSenhaController(LoginSenhaView view){
        this.view = view;
    }

    public void autenticar() {
        usuarioAutenticar = new UsuarioDAO();
        usuarioAutenticar.usuario.setLogin(view.getjTextFieldLogin().getText());
        usuarioAutenticar.usuario.setSenha(view.getjPasswordFieldSenha().getText());
        usuarioAutenticar.connect.getConnection();
        if(usuarioAutenticar.autenticarUsuarioSenha()){
            view.dispose();
            SubMenuMinhaContaView telaSubMenu = new SubMenuMinhaContaView();
            usuarioAutenticar.buscarUsuario();
            telaSubMenu.getjTextFieldAlterarLogin().setText(usuarioAutenticar.usuario.getLogin());
            telaSubMenu.getjTextFieldAlterarSenha().setText(usuarioAutenticar.usuario.getSenha());
            telaSubMenu.getjTextFieldAlterarNome().setText(usuarioAutenticar.usuario.getNome());
            telaSubMenu.getjTextFieldAlterarDataDeNascimento().setText(usuarioAutenticar.usuario.getDataDeNascimento());
            telaSubMenu.getjTextFieldAlterarCPF().setText(usuarioAutenticar.usuario.getCpf());
            telaSubMenu.getjTextFieldAlterarEmail().setText(usuarioAutenticar.usuario.getEmail());
            telaSubMenu.getjTextFieldAlterarEndereco().setText(usuarioAutenticar.usuario.getEndereco());
            telaSubMenu.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(view, "Senha ou usuário incorreto!");
        }
    }
}
