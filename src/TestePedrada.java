import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class TestePedrada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Isecmarini> teste = new ArrayList<>();

        PedradaDigital pedradaDigital1 = new PedradaDigital("lens", "lenicefonseca79@gmail.com",
                "Lenice", "Fonseca", "Lenny", "len123", "",
                "Estudante", "prigosa", teste, "", "");

        PedradaDigital pedradaDigital2 = new PedradaDigital("jotaP", "joaopedro@gmail.com",
                "Joao", "Barbosa", "jukinha", "jp5453", "Professor de programacao",
                "Professor", "pardal", teste, "", "");

        PedradaDigital pedradaDigital3 = new PedradaDigital("mali", "marialima@gmail.com",
                "Maria", "Lima", "mary", "w@ml", "Escritora",
                "Funcionario", "Joana D' Arc", teste, "", "");

        PedradaFoto pedradaFoto = new PedradaFoto();
        PedradaFoto pedradaFoto1 = new PedradaFoto(LocalDateTime.now(), "lens", "caramelo", "sem legenda");
        PedradaFoto pedradaFoto2 = new PedradaFoto(LocalDateTime.now(), "jotaP", "miranha", "sem legenda");
        PedradaFoto pedradaFoto3 = new PedradaFoto(LocalDateTime.now(), "mali", "halloween", "uuuu uuuu");
        PedradaFoto pedradaFoto4 = new PedradaFoto(LocalDateTime.now(), "mali", "gatoFofo", "cute");

        Comentario comentario1 = new Comentario("happy halowween", LocalDateTime.now(), "lens", "halloween");
        Comentario comentario2 = new Comentario("hahahahahahahaha", LocalDateTime.now(), "jotaP", "halloween");

//        pedradaDigital1.signUp();
//        pedradaDigital2.signUp();
//        pedradaDigital3.signUp();
//        pedradaDigital1.signIn();
//        pedradaDigital1.signOff();
//        pedradaDigital1.resetPassword("lens123", "lp123");

//        PedradaDigital pedradaDigital = new PedradaDigital();
//        pedradaDigital.verPerfil("Lenice", "Fonseca");
//        pedradaDigital.verPerfil("Joao", "Barbosa");
//        pedradaDigital1.mostraPerfil();
//        pedradaFoto.criarPost();
//        pedradaFoto1.criarPost();
//        pedradaFoto2.criarPost();
//        pedradaFoto4.criarPost();
//        comentario1.criarComentario();
//        comentario2.criarComentario();
//        pedradaFoto3.display();
        pedradaFoto3.displayPorAutor();


    }
}