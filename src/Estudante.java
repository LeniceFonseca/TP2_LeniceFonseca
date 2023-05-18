public class Estudante extends Isecmarini implements GestorEvento{

    private String codigo;
    private String curso;
    private int anoMatricula;
    private int anoCurso;
    private VidaEstudante atatus;

    public Estudante() {
    }

    public Estudante(String codigo, String curso, int anoMatricula, int anoCurso, VidaEstudante atatus) {
        this.codigo = codigo;
        this.curso = curso;
        this.anoMatricula = anoMatricula;
        this.anoCurso = anoCurso;
        this.atatus = atatus;
    }

    public void mandaPaTurma(){}

    @Override
    public void signUp() {

    }

    @Override
    public void signIn() {

    }

    @Override
    public void resetPassword() {

    }

    @Override
    public void signOff() {

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

    @Override
    public Pedrada manda(MembroRede membro) {
        return null;
    }

    @Override
    public void mostraPerfil() {

    }

    @Override
    public void mudarVisibilidade() {

    }

    @Override
    public void manda() {

    }

    @Override
    public void screveNaPedra(Isecmarini membro) {

    }
}
