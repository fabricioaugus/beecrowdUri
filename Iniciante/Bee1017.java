package Iniciante;
/*beecrowd | 1017 troca classe para Main, para passar, Tira nome do package*/ 
import java.util.Scanner;

public class Bee1017 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int tmpGasto = scanner.nextInt();
        int velMedia = scanner.nextInt();
        int distancia = tmpGasto*velMedia;
        // Consumo por km/l
        float consumoKML =  distancia/12.0f;

         System.out.printf("%.3f\n",consumoKML);
        
        
        scanner.close();
        
    }
    
}
