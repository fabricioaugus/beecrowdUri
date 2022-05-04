package Iniciante;
/* beecrowd | 1035 troca classe para Main, para passar, Tira nome do package */
import java.util.Scanner;

public class Bee1035 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorA = sc.nextInt();
        int valorB = sc.nextInt();
        int valorC = sc.nextInt();
        int valorD = sc.nextInt();
        if ((((valorB > valorC && valorD > valorA) && ((valorC + valorD) > (valorA + valorB)))
                && (valorC > 0 && valorD > 0)) && (valorA % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
        sc.close();
    }

}
