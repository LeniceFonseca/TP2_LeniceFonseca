public class Professor implements ModeradorGrupo{

    private String area;
    private String grau;
    private String departamento;

    public Professor() {
    }

    public Professor(String area, String grau, String departamento) {
        this.area = area;
        this.grau = grau;
        this.departamento = departamento;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void mandaColegas(){}

    @Override
    public void criar() {

    }

    @Override
    public void apagar() {

    }

    @Override
    public void adicionarMembro() {

    }

    @Override
    public void muteMembro() {

    }

    @Override
    public void removeMembro() {

    }

    @Override
    public void moderar() {

    }
}
