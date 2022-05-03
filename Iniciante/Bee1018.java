package Iniciante;

/*beecrowd | 1018 troca classe para Main, para passar, Tira nome do package*/
import java.util.Scanner;

public class Bee1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDinheiro = scanner.nextInt();
        int[] notas = { 100, 50, 20, 10, 5, 2, 1 };
        scanner.close();
        System.out.println(totalDinheiro);
        for (int i : notas) {
            int numDeNotas = totalDinheiro / i;
            System.out.printf("%d nota(s) de R$ %d,00\n", numDeNotas, i);
            totalDinheiro = totalDinheiro % i;
        }
    }
}
