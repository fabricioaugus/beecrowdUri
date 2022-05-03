package Iniciante;
/*beecrowd | 1014 troca classe para Main, para passar, Tira nome do package*/ 
import java.util.Scanner;
public class Bee1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distTtlPercorrida = scanner.nextInt();
        float ttlCombustivel = scanner.nextFloat();
        /* km/l */
        float kml =  distTtlPercorrida/ttlCombustivel;
        System.out.printf("%.3f km/l\n",kml);
        scanner.close();

    }
    
}
