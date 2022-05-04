package Iniciante;

/*beecrowd | 1019 troca classe para Main, para passar, Tira nome do package*/
import java.util.Scanner;

public class Bee1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSegundo = scanner.nextInt();
        int horas = numSegundo / 3600;
        int resHoras = numSegundo % 3600;
        int min = resHoras / 60;
        int resMin = resHoras % 60;
        System.out.printf("%d:%d:%d\n", horas, min,resMin);
        scanner.close();
    }
}
