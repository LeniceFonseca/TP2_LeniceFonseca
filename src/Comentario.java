import BDConnection.Conexao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class Comentario {

    private String comentario;
    private LocalDateTime data;
    private String autor;
    private String post;

    public Comentario() {
    }

    public Comentario(String comentario, LocalDateTime data, String autor, String post) {
        this.comentario = comentario;
        this.data = data;
        this.autor = autor;
        this.post = post;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Comentario responder(){return null;}
    public void gosto(){}
    public void traGosto(){}

    public void criarComentario(){
        String sql = "INSERT INTO comentarios (autor, data, post, comentario) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = Conexao.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, getAutor());
            preparedStatement.setString(2, String.valueOf(getData()));
            preparedStatement.setString(3, getPost());
            preparedStatement.setString(4, getComentario());

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
