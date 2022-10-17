import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            
                    System.out.println("Qual é a primeira nota do Aluno: ");
                int nota1 = ler.nextInt();
   
                    System.out.println("Qual é a segunda nota do Aluno: ");
                int nota2 = ler.nextInt();

                double media = (nota1 + nota2) / 2;
                ler.close();

                    System.out.println("Primeira Nota: " + nota1);
                    System.out.println("Segunda Nota: " + nota2);
                     System.out.println("A média é: " + media);

                if( (media >= 0) && (media <7) ){
                    System.out.println("REPROVADO");
                } else if(media <= 7){
                    System.out.println("APROVADO");
                }
        }
    }
}