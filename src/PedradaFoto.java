import BDConnection.Conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class PedradaFoto extends Pedrada{

    private String nomeFicheiro;
    private String legenda;

    public PedradaFoto() {
    }

    public PedradaFoto(LocalDateTime data, String autor, String nomeFicheiro, String legenda) {
        super(data, autor);
        this.nomeFicheiro = nomeFicheiro;
        this.legenda = legenda;
    }

    public PedradaFoto(String nomeFicheiro, String legenda) {
        this.nomeFicheiro = nomeFicheiro;
        this.legenda = legenda;
    }

    public void setNomeFicheiro(String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    public String getNomeFicheiro() {
        return nomeFicheiro;
    }

    public String getLegenda() {
        return legenda;
    }

    @Override
    public void gosto() {

    }

    @Override
    public void traGosto() {

    }

    @Override
    public Comentario masRiola() {
        return null;
    }

    @Override
    public void display() {
        String sql = "SELECT * FROM pedradafoto";
        PreparedStatement preparedStatement = null;


        try {

            preparedStatement = Conexao.getConnection().prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println();
                System.out.println("-------------------------------------------------------------------------------------------------------------");
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Autor: " + resultSet.getString("autor"));
                System.out.println("Legenda: " + resultSet.getString("legenda"));
                System.out.println("Data: " + resultSet.getString("data"));
                System.out.println("Imagem: " + resultSet.getString("imagem"));
                System.out.println("-------------------------------------------------------------------------------------------------------------");
                System.out.println();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void displayPorAutor() {
        String sql = "SELECT * FROM pedradafoto WHERE autor = ?";
        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = Conexao.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, getAutor());

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println();
                System.out.println("-------------------------------------------------------------------------------------------------------------");
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Autor: " + resultSet.getString("autor"));
                System.out.println("Imagem: " + resultSet.getString("imagem"));
                System.out.println("Legenda: " + resultSet.getString("legenda"));
                System.out.println("Data: " + resultSet.getString("data"));
                System.out.println("-------------------------------------------------------------------------------------------------------------");
                System.out.println();
            }

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * Este metodo permite que usuarios da rede social Pedrada Digital criem um post com imagem
     *
     * @throws SQLException caso nao consiga aceder a base de dados.
     */
    @Override
    public void criarPost() {
        String sql = "INSERT INTO pedradafoto (imagem, legenda, autor, data) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = Conexao.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, getNomeFicheiro());
            preparedStatement.setString(2, getLegenda());
            preparedStatement.setString(3, getAutor());
            preparedStatement.setString(4, String.valueOf(getData()));

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
