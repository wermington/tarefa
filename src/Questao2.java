import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
                System.out.println("Digite um número: ");
            int x = ler.nextInt();
                System.out.println("O número anterior a " + x + " é: " + (x - 1));
                System.out.println("O número depois a " + x + " é: " + (x + 1));
            ler.close();
        }
      }
    }
    
