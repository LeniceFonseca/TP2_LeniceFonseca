import java.util.Date;

public class PedradaEvento extends Pedrada{

    private TipoEvento tipo;
    private Date data;
    private String local;
    private String entrada;
    private String status;

    public PedradaEvento() {
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    }
}
