//Soma de Números Pares: Peça ao usuário um número e some todos os números pares até esse número.
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int number = scanner.nextInt();

        int soma = 0;
        for (int i = 0; i <= number; i += 2){
            soma = soma + i;
        };
        System.out.println("soma: " + soma);
    }
}