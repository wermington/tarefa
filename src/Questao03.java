import java.util.Scanner;

public class Questao03 {
   
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            {
                    System.out.println("Digite seu nome: ");
                String nomeUsuario = ler.nextLine();
                    System.out.println("Olá " + nomeUsuario );
                ler.close();
            }
        }
    }
}