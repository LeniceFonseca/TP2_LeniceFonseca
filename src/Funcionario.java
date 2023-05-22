public class Funcionario implements GestorEvento{

    private String uo;
    private String funcao;

    public Funcionario() {
    }

    public Funcionario(String uo, String funcao) {
        this.uo = uo;
        this.funcao = funcao;
    }

    public String getUo() {
        return uo;
    }

    public void setUo(String uo) {
        this.uo = uo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public void novo() {

    }

    @Override
    public void novoRecorrente() {

    }

    @Override
    public void convidar() {

    }
}
