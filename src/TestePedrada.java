import java.util.ArrayList;
import java.util.Scanner;

public class TestePedrada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Isecmarini> teste = new ArrayList<>();

        PedradaDigital pedradaDigital1 = new PedradaDigital("lens", "lenicefonseca79@gmail.com",
                "Lenice", "Fonseca", "Lenny", "len123", "",
                "Estudante", "prigosa", teste, "", "");

//        PedradaDigital pedradaDigital2 = new PedradaDigital("jotaP", "joaopedro@gmail.com",
//                "Joao", "Barbosa", "jukinha", "jp5453", "Professor de programacao",
//                "Professor", "pardal", teste, "", "");

//        pedradaDigital1.signUp();
//        pedradaDigital2.signUp();
//        pedradaDigital1.signIn();
//        pedradaDigital1.signOff();
//        pedradaDigital1.resetPassword("lens123", "lp123");

//        PedradaDigital pedradaDigital = new PedradaDigital();
//        pedradaDigital.verPerfil("Lenice", "Fonseca");
//        pedradaDigital.verPerfil("Joao", "Barbosa");
        pedradaDigital1.mostraPerfil();

    }
}