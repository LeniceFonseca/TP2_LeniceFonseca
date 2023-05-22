import javax.xml.crypto.Data;

public class Grupo {

    private int id;
    private Data data;
    private String estado;

    public Grupo() {
    }

    public Grupo(int id, Data data, String estado) {
        this.id = id;
        this.data = data;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
