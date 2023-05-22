import java.time.LocalDateTime;

public class PedradaMensagem extends Pedrada{

    private String mensagem;

    public PedradaMensagem(LocalDateTime data, String autor, String mensagem) {
        super(data, autor);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getTexto() {
        return mensagem;
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
