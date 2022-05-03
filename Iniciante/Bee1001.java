package Iniciante;
/*beecrowd | 1001 troca classe para Main, para passar*/
import java.util.Scanner;

public class Bee1001 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = num1 + num2;
        System.out.printf("X = %d\n", num3);
        scanner.close();
    }
}
