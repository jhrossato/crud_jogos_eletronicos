package Controller;

import DAO.UsuarioDAO;
import Model.Usuario;
import View.LoginView;
import View.MenuClienteView;
import View.MenuVendedorView;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class LoginControl {
    public LoginView view;
    Connection connection;
    UsuarioDAO usuarioAutenticar;
    Usuario usuarioLogado;
    
    public LoginControl(LoginView view){
        this.view = view;
    }

    public void consultaLoginESenha() {
        usuarioAutenticar = new UsuarioDAO();
        usuarioAutenticar.usuario.setLogin(view.getjTextFieldUsuario().getText());
        usuarioAutenticar.usuario.setSenha(view.getjPasswordFieldSenha().getText());   
        usuarioAutenticar.connect.getConnection();
        if(usuarioAutenticar.autenticarUsuarioSenha()){
            view.dispose();
            usuarioAutenticar.buscarUsuario();
            System.out.println(usuarioAutenticar.usuario.getTipo());
            if("Cliente".equals(usuarioAutenticar.usuario.getTipo())){
                MenuClienteView telaMenu = new MenuClienteView();
                telaMenu.setVisible(true);
            }else if("Vendedor".equals(usuarioAutenticar.usuario.getTipo())){
                MenuVendedorView telaMenu = new MenuVendedorView();
                telaMenu.setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(view, "Senha ou usuário incorreto!");
        }
    }
    
}
