import java.util.ArrayList;

public abstract class Isecmarini implements MembroRede{

    private String username;
    private String email;
    private String nome;
    private String apelido;
    private String alcunha;
    private String password;
    private ArrayList<Isecmarini> marins;
    private ArrayList<Pedrada> nhasPedrada;
    private boolean visivel;

    public Isecmarini() {
    }

    public abstract void signUp();
    public abstract void signIn();
    public abstract void resetPassword();
    public abstract void signOff();

}
