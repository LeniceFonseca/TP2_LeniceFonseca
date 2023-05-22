import java.time.LocalDateTime;

public class PedradaEvento extends Pedrada{

    private TipoEvento tipo;
    private LocalDateTime data;
    private String local;
    private String entrada;
    private String status;


    public PedradaEvento(String autor, TipoEvento tipo, LocalDateTime data, String local, String entrada, String status) {
        super(data, autor);
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

    @Override
    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
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

    @Override
    public void criarPost() {

    }

}
