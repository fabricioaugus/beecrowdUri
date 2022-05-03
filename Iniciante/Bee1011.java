package Iniciante;

/*beecrowd | 1011 troca classe para Main, para passar, Tira nome do package*/
import java.util.Scanner;

public class Bee1011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        double pi = 3.14159;
        double r = Math.pow(raio, 3);
        double formula = (4 / 3.0) * pi * r;
        System.out.printf("VOLUME = %.3f\n", formula);
        scanner.close();
    }

}
