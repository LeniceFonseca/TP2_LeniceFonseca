import java.time.LocalDateTime;
import java.util.Date;

public abstract class Pedrada {

    private String autor;
    private LocalDateTime data;


    public Pedrada(LocalDateTime data, String autor) {
        this.data = data;
        this.autor = autor;
    }

    public Pedrada() {

    }

    public abstract void gosto();
    public abstract void traGosto();
    public abstract Comentario masRiola();

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }


    public abstract void display();
    public abstract void criarPost();
}
