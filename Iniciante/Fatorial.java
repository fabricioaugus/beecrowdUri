package Iniciante;

import java.util.Scanner;

/* Fatorial */
public class Fatorial {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int valorLido = scanner.nextInt();
            int fatorial = 1;
            int i;

            for (i = 1; i <= valorLido; i++) {
                fatorial *= i;
            }
            
            System.out.println("Fatorial de " + (i - 1) + " = " + fatorial);
            scanner.close();
        }
    }
}
