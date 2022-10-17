
import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
       

        Scanner ler = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
            System.out.println("Digite o valor (R$) da hora: ");
        double valorHora = ler.nextDouble();
            System.out.println("Quantas horas trabalhou? ");
        double horasTrabalhadas = ler.nextDouble();

        double valor = valorHora * horasTrabalhadas;

            System.out.println(nome + " vai receber R$ " + valor + " pelo trampo.");
        ler.close();
    }
}