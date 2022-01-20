package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Usuario;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    public Usuario usuario;
    public Connect connect;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String sql;

    public UsuarioDAO() {
        connect = new Connect();
        usuario = new Usuario();
    }
    
    
    public boolean autenticarUsuarioSenha() {
        sql = "SELECT * FROM usuario WHERE usuario_login = ? AND usuario_senha = ?";
        try {
            statement = connect.connection.prepareStatement(sql);
            statement.setString(1, usuario.getLogin());
            statement.setString(2, usuario.getSenha());
            resultSet = statement.executeQuery();
            resultSet.next();
            usuario.setLogin(resultSet.getString(3));
            usuario.setSenha(resultSet.getString(4));
            return true;
        } catch (SQLException erro) {
            return false;
        } finally {
            connect.close();
        }
    }
    
    public boolean cadastrarUsuario(){
        String sql = "INSERT INTO usuario(usuario_tipo, usuario_login, usuario_senha, usuario_nome, usuario_cpf, usuario_dataNascimento, usuario_email, usuario_endereco) VALUES (?,?,?,?,?,?,?,?)";
        try{
            connect.getConnection();
            statement = connect.connection.prepareStatement(sql);
            statement.setString(1, usuario.getTipo());
            statement.setString(2, usuario.getLogin());
            statement.setString(3, usuario.getSenha());
            statement.setString(4, usuario.getNome());
            statement.setString(5, usuario.getCpf());
            statement.setString(6, usuario.getDataDeNascimento());
            statement.setString(7, usuario.getEmail());
            statement.setString(8, usuario.getEndereco());
            statement.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
            return false;
        } finally {
            connect.close();
        }
    }
    
    public boolean buscarUsuario() {
        sql = "SELECT * FROM usuario WHERE usuario_login = ? AND usuario_senha = ?";
        try {
            connect.getConnection();
            statement = connect.connection.prepareStatement(sql);
            statement.setString(1, usuario.getLogin());
            statement.setString(2, usuario.getSenha());
            resultSet = statement.executeQuery();
            resultSet.next();
            usuario.setTipo(resultSet.getString(2));
            usuario.setLogin(resultSet.getString(3));
            usuario.setSenha(resultSet.getString(4));
            usuario.setNome(resultSet.getString(5));
            usuario.setCpf(resultSet.getString(6));
            usuario.setDataDeNascimento(resultSet.getString(9));
            usuario.setEmail(resultSet.getString(7));
            usuario.setEndereco(resultSet.getString(8));
            return true;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
            return false;
        } finally {
            connect.close();
        }
    }
}
