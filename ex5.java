//Fatorial Básico: Calcule o fatorial de um número fornecido pelo usuário.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        for (int i = 1; i < numero; i++){
            x = x * (i + 1);
        };
        System.out.println(x);
    }
}