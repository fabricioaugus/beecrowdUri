package Iniciante;
/*URI Online Judge | 1013 troca classe para Main, para passar, Tira nome do package*/
import java.util.Scanner;

public class Bee1013 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();
        int valorC = scanner.nextInt();
 
        int maiorAB = ((valorA+valorB)+Math.abs(valorA-valorB))/2;
        int maiorBC = ((maiorAB+valorC)+Math.abs(maiorAB-valorC))/2;
 
       System.out.printf("%d eh o maior\n", maiorBC);
       scanner.close();
         
     }

    
}
