import java.util.Date;

public class PedradaEvento extends Pedrada{

    private TipoEvento tipo;
    private Date data;
    private String local;
    private String entrada;
    private String status;

    public PedradaEvento() {
    }

    public PedradaEvento(TipoEvento tipo, Date data, String local, String entrada, String status) {
        this.tipo = tipo;
        this.data = data;
        this.local = local;
        this.entrada = entrada;
        this.status = status;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
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
