//Soma de Números: Peça ao usuário para inserir um número e some todos os números de 1 até esse número.
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        int x = 0;
        System.out.println("Digite um numero");
        Scanner entrada = new Scanner(System.in);
        x = entrada.nextInt();
        

        int soma = 0;

        for (int i = 0; i <= x; i++){
            soma = soma + i; 
        }
        System.out.println(soma);
    }
}