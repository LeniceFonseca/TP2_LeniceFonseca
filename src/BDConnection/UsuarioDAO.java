package BDConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public void cadastrarUsuario(Usuario usuario) {

        String sql = "INSERT INTO clientes (nome, email) VALUES (?, ?)";
        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = Conexao.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getEmail());

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void removerUsuario(Usuario usuario) {

        String sql = "DELETE FROM clientes WHERE nome = ?";
        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = Conexao.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, usuario.getNome());

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void listarTodosUsuarios() {

        String sql = "SELECT * FROM clientes";
        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = Conexao.getConnection().prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                // Extrair os dados de cada usuário
                int id = resultSet.getInt("id");
                String nomeCliente = resultSet.getString("nome");
                String emailCliente = resultSet.getString("email");
                // ...

                // Imprimir os dados do usuário
                System.out.println("ID: " + id);
                System.out.println("Nome: " + nomeCliente);
                System.out.println("Email: " + emailCliente);
                // ...
                System.out.println("----------------------");
            }

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void listarUsuario(Usuario usuario) {

        String sql = "SELECT * FROM clientes WHERE nome LIKE ?";
        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = Conexao.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, usuario.getNome());

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                // Extrair os dados de cada usuário
                int id = resultSet.getInt("id");
                String nomeCliente = resultSet.getString("nome");
                String emailCliente = resultSet.getString("email");
                // ...

                // Imprimir os dados do usuário
                System.out.println("ID: " + id);
                System.out.println("Nome: " + nomeCliente);
                System.out.println("Email: " + emailCliente);
                // ...
                System.out.println("----------------------");
            }

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUsuario(String nome, int id, String novoNome, String novoEmail) {

        String sql = "UPDATE clientes SET nome = ?, email = ? WHERE id = ? OR nome = ?";
        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = Conexao.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, novoNome);
            preparedStatement.setString(2, novoEmail);
            preparedStatement.setInt(3, id);
            preparedStatement.setString(4, nome);

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
