public class Alumni {

    private String trabalho;
    private String funcao;
    private String email;

    public Alumni() {
    }

    public Alumni(String trabalho, String funcao, String email) {
        this.trabalho = trabalho;
        this.funcao = funcao;
        this.email = email;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
