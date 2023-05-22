import BDConnection.Conexao;
import BDConnection.UsuarioDAO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class PedradaDigital extends Isecmarini{

    private ArrayList<Isecmarini> comunidade;
    private String grupos;
    private String eventos;

    public PedradaDigital(String username, String email, String nome, String apelido, String alcunha,
                          String password, String biografia, String categoria, boolean visivel,
                          String pseudonimo, ArrayList<Isecmarini> comunidade, String grupos, String eventos) {

        super(username, email, nome, apelido, alcunha, password, biografia, categoria, visivel, pseudonimo);
        this.comunidade = comunidade;
        this.grupos = grupos;
        this.eventos = eventos;
    }

    public PedradaDigital(String username, String password) {
        super(username, password);
    }

    public ArrayList<Isecmarini> getComunidade() {
        return comunidade;
    }

    public void setComunidade(ArrayList<Isecmarini> comunidade) {
        this.comunidade = comunidade;
    }

    public String getGrupos() {
        return grupos;
    }

    public void setGrupos(String grupos) {
        this.grupos = grupos;
    }

    public String getEventos() {
        return eventos;
    }

    public void setEventos(String eventos) {
        this.eventos = eventos;
    }

    public void signIn(){
        String sql = "SELECT * FROM usuarios WHERE nome = ? AND password = ?";
        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = Conexao.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, getNome());
            preparedStatement.setString(2, getPassword());

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Dados encontrados no banco de dados.");
            } else {
                System.out.println("Dados não encontrados no banco de dados.");
            }

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void signOff(){}
    public Isecmarini signUp(){
//        Scanner scanner = new Scanner(System.in);
//        boolean visibilidade = false;
//
//        System.out.print("Nome: ");
//        String nome = scanner.next();
//        System.out.print("Apelido: ");
//        String apelido = scanner.next();
//        System.out.print("Email: ");
//        String email = scanner.next();
//        System.out.print("Username: ");
//        String username = scanner.next();
//        System.out.print("Password: ");
//        String password = scanner.next();
//        System.out.print("Categoria: ");
//        String categoria = scanner.next();
//        System.out.print("Alcunha: ");
//        String alcunha = scanner.next();
//        System.out.print("Pseudonimo: ");
//        String pseudonimo = scanner.next();
//        System.out.print("Visibilidade (Ativo/Inativo): ");
//        String v = scanner.next();
//        System.out.print("Bibliografia: ");
//        String bibliografia = scanner.next();
//
//        v.toLowerCase();
//
//        if (v.equals("ativo")) {
//            visibilidade = true;
//        }
//        else if (v.equals("inativo")) {
//            visibilidade = false;
//        }
//        else {
//            System.out.println("Invalido!");
//        }

        String sql = "INSERT INTO usuarios (nome, apelido, email, username, password, categoria, alcunha, pseudonimo, visibilidade, biografia) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = Conexao.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, getNome());
            preparedStatement.setString(2, getApelido());
            preparedStatement.setString(3, getEmail());
            preparedStatement.setString(4, getUsername());
            preparedStatement.setString(5, getPassword());
            preparedStatement.setString(6, getCategoria());
            preparedStatement.setString(7, getAlcunha());
            preparedStatement.setString(8, getPseudonimo());
            preparedStatement.setString(9, String.valueOf(isVisivel()));
            preparedStatement.setString(10, getBiografia());

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new PedradaDigital(getUsername(), getEmail(),getNome(), getApelido(), getAlcunha(), getPassword(),getBiografia(),
               getCategoria(),isVisivel(), getPseudonimo(), null, null, null);
    }

    @Override
    public void resetPassword() {

    }

    @Override
    public void verPerfil() {

    }

    @Override
    public void defenirVisibilidade() {

    }

    @Override
    public Pedrada manda(MembroRede membro) {
        return null;
    }

    @Override
    public void mostraPerfil() {

    }

    @Override
    public void mudarVisibilidade() {

    }

    @Override
    public void manda() {

    }

    @Override
    public void screveNaPedra(Isecmarini membro) {

    }
}
