package DAO;

import Model.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    public Connect connect;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String sql;
    public Produto produto;
    
    public ProdutoDAO(){
        connect = new Connect();
        produto = new Produto();
    }
    
    public boolean inserirProduto(){
        String sql = "INSERT INTO produto(produto_nome, produto_valor, produto_descricao, produto_categoria, produto_quantidade) VALUES (?,?,?,?,?)";
        try{
            connect.getConnection();
            statement = connect.connection.prepareStatement(sql);
            statement.setString(1, produto.getNome());
            statement.setFloat(2, produto.getValor());
            statement.setString(3, produto.getDescricao());
            statement.setString(4, produto.getCategoria());
            statement.setInt(5, produto.getQuantidade());
            statement.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir!");
            return false;
        } finally {
            connect.close();
        }
    }
    
    public boolean buscarProduto() {
        sql = "SELECT * FROM produto WHERE produto_nome = ? OR produto_categoria = ?";
        try {
            connect.getConnection();
            statement = connect.connection.prepareStatement(sql);
            statement.setString(1, produto.getNome());
            statement.setString(2, produto.getCategoria());
            resultSet = statement.executeQuery();
            resultSet.next();
            produto.setId(resultSet.getInt(1));
            produto.setNome(resultSet.getString(2));
            produto.setValor(resultSet.getFloat(3));
            produto.setDescricao(resultSet.getString(4));
            produto.setCategoria(resultSet.getString(5));
            produto.setQuantidade(resultSet.getInt(6));
            return true;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
            return false;
        } finally {
            connect.close();
        }
    }
    
    public List<Produto> listarTodosProdutos(){
        String sql = "SELECT * FROM produto";
        List<Produto> retorno = new ArrayList<>();
        try{
            connect.getConnection();
            statement = connect.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                produto = new Produto();
                produto.setId(Integer.parseInt(resultSet.getString("produto_id")));
                produto.setNome(resultSet.getString("produto_nome"));
                produto.setValor(Float.parseFloat(resultSet.getString("produto_valor")));
                produto.setDescricao(resultSet.getString("produto_descricao"));
                produto.setCategoria(resultSet.getString("produto_categoria"));
                produto.setQuantidade(Integer.parseInt(resultSet.getString("produto_quantidade"))); 
                retorno.add(produto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar!");
        } finally {
            connect.close();
        }
        return retorno;
    }
    
    public List<Produto> listarProdutos(){
        String sql = "SELECT * FROM produto WHERE produto_nome = ? OR produto_categoria = ?";
        List<Produto> retorno = new ArrayList<>();
        try{
            connect.getConnection();
            statement = connect.connection.prepareStatement(sql);
            statement.setString(1, produto.getNome());
            statement.setString(2, produto.getCategoria());
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                produto = new Produto();
                produto.setId(Integer.parseInt(resultSet.getString("produto_id")));
                produto.setNome(resultSet.getString("produto_nome"));
                produto.setValor(Float.parseFloat(resultSet.getString("produto_valor")));
                produto.setDescricao(resultSet.getString("produto_descricao"));
                produto.setCategoria(resultSet.getString("produto_categoria"));
                produto.setQuantidade(Integer.parseInt(resultSet.getString("produto_quantidade")));
                retorno.add(produto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar!");
        } finally {
            connect.close();
        }
        return retorno;
    }
    
    public List<Produto> listarCarrinho(){
        String sql = "SELECT * FROM carrinho";
        List<Produto> retorno = new ArrayList<>();
        try{
            connect.getConnection();
            statement = connect.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                produto = new Produto();
                produto.setId(Integer.parseInt(resultSet.getString("produto_id")));
                produto.setNome(resultSet.getString("produto_nome"));
                produto.setValor(Float.parseFloat(resultSet.getString("produto_valor")));
                produto.setDescricao(resultSet.getString("produto_descricao"));
                produto.setCategoria(resultSet.getString("produto_categoria")); 
                retorno.add(produto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar!");
        } finally {
            connect.close();
        }
        return retorno;
    }
    
    public boolean inserirProdutoNoCarrinho(){
        String sql = "INSERT INTO carrinho(produto_id, produto_nome, produto_valor, produto_descricao, produto_categoria, produto_quantidade) VALUES (?,?,?,?,?,?)";
        try{
            connect.getConnection();
            statement = connect.connection.prepareStatement(sql);
            statement.setInt(1, produto.getId());
            statement.setString(2, produto.getNome());
            statement.setFloat(3, produto.getValor());
            statement.setString(4, produto.getDescricao());
            statement.setString(5, produto.getCategoria());
            statement.setInt(6, produto.getQuantidade());
            statement.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir!");
            return false;
        } finally {
            connect.close();
        }
    }
}
