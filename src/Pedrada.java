import java.util.ArrayList;

public abstract class Pedrada {

    private int id;
    private String username;
    private long carimboTempo;
    private int gostos;
    private ArrayList<Comentario> comentarios;

    public Pedrada() {
    }

    public abstract void gosto();
    public abstract void traGosto();
    public abstract Comentario masRiola();

    public long getCarimboTempo() {
        return carimboTempo;
    }

    public abstract void display();
}
