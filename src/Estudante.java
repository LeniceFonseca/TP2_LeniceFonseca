public class Estudante extends Isecmarini implements GestorEvento{

    private String codigo;
    private String curso;
    private int anoMatricula;
    private int anoCurso;
    private VidaEstudante atatus;



    public Estudante(String username, String email, String nome, String apelido, String alcunha, String password,
                     String bibliografia, String categoria, boolean visivel, String pseudonimo,
                     String codigo, String curso, int anoMatricula, int anoCurso, VidaEstudante atatus) {
        super(username, email, nome, apelido, alcunha, password, bibliografia, categoria, visivel, pseudonimo);
        this.codigo = codigo;
        this.curso = curso;
        this.anoMatricula = anoMatricula;
        this.anoCurso = anoCurso;
        this.atatus = atatus;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoMatricula() {
        return anoMatricula;
    }

    public void setAnoMatricula(int anoMatricula) {
        this.anoMatricula = anoMatricula;
    }

    public int getAnoCurso() {
        return anoCurso;
    }

    public void setAnoCurso(int anoCurso) {
        this.anoCurso = anoCurso;
    }

    public VidaEstudante getAtatus() {
        return atatus;
    }

    public void setAtatus(VidaEstudante atatus) {
        this.atatus = atatus;
    }

    public void mandaPaTurma(){}


    @Override
    public void resetPassword(String nome, String novaSenha) {

    }

    @Override
    public void verPerfil(String nome, String apelido) {

    }

    @Override
    public void defenirVisibilidade() {

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
