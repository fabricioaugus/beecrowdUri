package Iniciante;
/*beecrowd | 1016 troca classe para Main, para passar, Tira nome do package*/ 
import java.util.Scanner;
public class Bee1016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distacia = scanner.nextInt();
        int tempoNecess = distacia*2;
        System.out.printf("%d minutos\n", tempoNecess);
        scanner.close();
    }
}
