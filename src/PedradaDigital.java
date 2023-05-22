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
                          String password, String biografia, String categoria,
                          String pseudonimo, ArrayList<Isecmarini> comunidade, String grupos, String eventos) {

        super(username, email, nome, apelido, alcunha, password, biografia, categoria, pseudonimo);
        this.comunidade = comunidade;
        this.grupos = grupos;
        this.eventos = eventos;
    }

    public PedradaDigital(String username, String password) {
        super(username, password);
    }

    public PedradaDigital() {
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


    /**
     * Este metodo permite que usuarios da rede social Pedrada Digital facam LogIn
     *
     * @throws SQLException caso nao consiga aceder a base de dados.
     */
    public void signIn(){
        String sql = "SELECT * FROM usuarios WHERE nome = ? AND password = ?";
        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = Conexao.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, getNome());
            preparedStatement.setString(2, getPassword());

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Signed in!");
            } else {
                System.out.println("Nome ou senha estao incorretas!");
            }

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * Este metodo permite que usuarios da rede social Pedrada Digital facam LogOut
     *
     * @throws SQLException caso nao consiga aceder a base de dados.
     */
    public void signOff(){
        String sql = "SELECT * FROM usuarios WHERE nome = ? AND password = ?";
        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = Conexao.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, getNome());
            preparedStatement.setString(2, getPassword());

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Signed off!");
            }

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * Este metodo permite que usuarios da rede social Pedrada Digital criam suas contas
     *
     * @throws SQLException caso nao consiga aceder a base de dados.
     * @return perfil criado
     */
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
               getCategoria(), getPseudonimo(), null, null, null);
    }



    /**
     * Este metodo permite que usuarios da rede social Pedrada Digital mudem a sua senha
     *
     * @param senha a ser alterada
     * @param novaSenha
     * @throws SQLException caso nao consiga aceder a base de dados.
     */
    @Override
    public void resetPassword(String senha, String novaSenha) {
        String sql = "UPDATE usuarios SET password = ? WHERE password = ?";
        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = Conexao.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, novaSenha);
            preparedStatement.setString(2, getPassword());

            int linhasAfetadas = preparedStatement.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Senha alterada com sucesso.");
            } else {
                System.out.println("Nenhum registro encontrado para a senha fornecida.");
            }

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    /**
     * Este metodo permite que usuarios da rede social Pedrada Digital veja o perfil de outro usuario
     *
     * @param nome da pessoa cujo deseja visitar o perfil
     * @param apelido da pessoa cujo deseja visitar o perfil
     * @throws SQLException caso nao consiga aceder a base de dados.
     */
    @Override
    public void verPerfil(String nome, String apelido) {
        String sql = "SELECT * FROM usuarios WHERE nome = ? AND apelido = ?";
        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = Conexao.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, apelido);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Prfil de " + resultSet.getString("nome") + " " + resultSet.getString("apelido"));
                System.out.println("Meu nome eh " + resultSet.getString("nome") + " " + resultSet.getString("apelido") +
                        " mais conhecido(a) por " + resultSet.getString("alcunha") + " e sou " + resultSet.getString("categoria") +
                        " da UTA. Aqui vao mais algumas informacoes sobre mim: ");
                System.out.println("Email: " + resultSet.getString("email"));
                if (!(resultSet.getString("biografia").equals(""))) {
                    System.out.println("Biografia: " + resultSet.getString("biografia"));
                }
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
            }

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void defenirVisibilidade() {
        PedradaDigital pedradaDigital = new PedradaDigital();
        pedradaDigital.setVisivel(true);
    }

    @Override
    public Pedrada manda(MembroRede membro) {
        return null;
    }


    /**
     * Este metodo permite que usuarios da rede social Pedrada Digital veja o seu proprio perfil
     *
     * @throws SQLException caso nao consiga aceder a base de dados.
     */
    @Override
    public void mostraPerfil() {
        String sql = "SELECT * FROM usuarios WHERE nome = ? AND apelido = ?";
        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = Conexao.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, getNome());
            preparedStatement.setString(2, getApelido());

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Meu perfil");
                System.out.println("Meu nome eh " + resultSet.getString("nome") + " " + resultSet.getString("apelido") +
                        " mais conhecido(a) por " + resultSet.getString("alcunha") + " e sou " + resultSet.getString("categoria") +
                        " da UTA. Aqui vao mais algumas informacoes sobre mim: ");
                System.out.println("Email: " + resultSet.getString("email"));
                if (!(resultSet.getString("biografia").equals(""))) {
                    System.out.println("Biografia: " + resultSet.getString("biografia"));
                }
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
            }

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    /**
     * Este metodo permite que usuarios da rede social Pedrada Digital mudem o seu estado
     * de ativo para inativo e vice-versa
     *
     * @param pedradaDigital perfil do usuario
     * @throws SQLException caso nao consiga aceder a base de dados.
     */
    @Override
    public void mudarVisibilidade(PedradaDigital pedradaDigital) {
        if (pedradaDigital.isVisivel()) {
            pedradaDigital.setVisivel(false);
        }
        else {
            pedradaDigital.setVisivel(true);
        }
    }

    @Override
    public void manda() {

    }

    @Override
    public void screveNaPedra(Isecmarini membro) {

    }
}
