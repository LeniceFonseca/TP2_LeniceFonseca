import java.time.LocalDateTime;

public class Comentario {

    private String texto;
    private LocalDateTime dataHora;
    private int gostos;

    public Comentario() {
    }

    public Comentario(String texto, LocalDateTime dataHora, int gostos) {
        this.texto = texto;
        this.dataHora = dataHora;
        this.gostos = gostos;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public int getGostos() {
        return gostos;
    }

    public void setGostos(int gostos) {
        this.gostos = gostos;
    }

    public Comentario responder(){return null;}
    public void gosto(){}
    public void traGosto(){}


}
