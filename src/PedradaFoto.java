public class PedradaFoto extends Pedrada{

    private String nomeFicheiro;
    private String legenda;

    public PedradaFoto() {
    }

    public PedradaFoto(String nomeFicheiro, String legenda) {
        this.nomeFicheiro = nomeFicheiro;
        this.legenda = legenda;
    }

    public void setNomeFicheiro(String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    public String getNomeFicheiro() {
        return nomeFicheiro;
    }

    public String getLegenda() {
        return legenda;
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
