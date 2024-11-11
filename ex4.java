//Tabuada Simples: Peça ao usuário um número e mostre a tabuada desse número até 10.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        for (int i = 0; i <= 10; i++){
            x = numero * i;
            System.out.println(numero + " x " + (i) + " = " + x);
        };
    }
}