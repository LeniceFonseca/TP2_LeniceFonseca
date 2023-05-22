import java.util.ArrayList;
import java.util.Scanner;

public class TestePedrada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Isecmarini> teste = new ArrayList<>();

        PedradaDigital pedradaDigital1 = new PedradaDigital("lens", "lenicefonseca79@gmail.com",
                "Lenice", "Fonseca", "Lenny", "len123", "",
                "Estudante", true, "prigosa", teste, "", "");

//        PedradaDigital pedradaDigital2 = new PedradaDigital("jotaP", "joaopedro@gmail.com",
//                "Joao", "Barbosa", "jukinha", "jp5453", "Professor de programacao",
//                "Professor", false, "pardal", teste, "", "");

//        pedradaDigital1.signUp();
//        pedradaDigital2.signUp();


        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Senha: ");
        String password = scanner.next();

        PedradaDigital p = new PedradaDigital(nome, password);

        p.signIn();

    }
}