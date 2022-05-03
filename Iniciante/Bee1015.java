package Iniciante;
/*beecrowd | 1015 troca classe para Main, para passar, Tira nome do package*/ 
import java.util.Scanner;

public class Bee1015 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float pontoX1 = scanner.nextFloat();
        float pontoY1 = scanner.nextFloat();
        float pontoX2 = scanner.nextFloat();
        float pontoY2 = scanner.nextFloat();
        double distacia = Math.sqrt(Math.pow((pontoX2-pontoX1),2)+Math.pow((pontoY2-pontoY1),2));

        System.out.printf("%.4f\n",distacia);
        scanner.close();

    }
    
}
