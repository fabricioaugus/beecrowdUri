package Iniciante;
/*beecrowd | 1005 troca classe para Main, para passar, Tira nome do package*/
import java.util.Scanner;
public class Bee1005 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float pesoNotaA= 3.5f;
        float pesoNotaB= 7.5f;
        float notaA = scan.nextFloat();
        float notaB = scan.nextFloat();
        double media = ((pesoNotaB*notaB)+(pesoNotaA*notaA))/(pesoNotaA+pesoNotaB);
        System.out.printf("MEDIA = %.5f\n", media);
        scan.close();
    }
    
}
