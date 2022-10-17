

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
      
        Scanner ler = new Scanner(System.in);

            System.out.println("Qual o valor da conta? ");
        double valorConta = ler.nextDouble();

            System.out.println("Quantas pessoas vai dividir a conta? ");
        int pessoas = ler.nextInt();

        double valorFinal = valorConta + (valorConta * 10 / 100);
        double divisao = valorFinal / pessoas;

             System.out.println("Deu R$ " + divisao + " pra cada.");
        ler.close();
    }
}
