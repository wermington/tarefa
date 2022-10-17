

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
      

        Scanner ler = new Scanner(System.in);
            System.out.println("Qual o valor do jantar? ");
        double valorJantar = ler.nextDouble();

        double valorFinal = valorJantar + (valorJantar * 10 / 100);
        System.out.println("O valor total é: " + valorFinal + "Ja incluso a taxa de 10% do atendente sobre o valor total");
        ler.close();
    }
}