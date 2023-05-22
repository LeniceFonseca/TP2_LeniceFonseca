import java.util.ArrayList;

public abstract class Isecmarini implements MembroRede{

    private String username;
    private String email;
    private String nome;
    private String apelido;
    private String pseudonimo;
    private String alcunha;
    private String password;
    private String biografia;
    private String categoria;
    private boolean visivel;

    public Isecmarini() {}

    public Isecmarini(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Isecmarini(String username, String email, String nome, String apelido, String alcunha,
                      String password, String biografia, String categoria, boolean visivel, String pseudonimo) {
        this.username = username;
        this.email = email;
        this.nome = nome;
        this.apelido = apelido;
        this.alcunha = alcunha;
        this.password = password;
        this.visivel = visivel;
        this.categoria = categoria;
        this.biografia = biografia;
        this.pseudonimo = pseudonimo;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String bibliografia) {
        this.biografia = bibliografia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getAlcunha() {
        return alcunha;
    }

    public void setAlcunha(String alcunha) {
        this.alcunha = alcunha;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public boolean isVisivel() {
        return visivel;
    }

    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }

    public abstract void resetPassword(String senha, String novaSenha);
    public abstract void verPerfil(String nome, String apelido);
    public abstract void defenirVisibilidade();

}
