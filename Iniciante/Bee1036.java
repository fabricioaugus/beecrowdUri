package Iniciante;
/* beecrowd | 1036 troca classe para Main, para passar, Tira nome do package */
import java.util.Scanner;
public class Bee1036 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double valorA = scanner.nextDouble();
        double valorB = scanner.nextDouble();
        double valorC = scanner.nextDouble();
        double delta = Math.pow(valorB, 2) - 4*valorA*valorC;
        double bhaskaraMais = (Math.sqrt(delta)-valorB)/(2*valorA); 
        double bhaskaraMenos = (-valorB-Math.sqrt(delta))/(2*valorA); 
        if(delta<0 || valorA == 0){
            System.out.println("Impossivel calcular");
        }else{
            System.out.printf("R1 = %.5f\n",bhaskaraMais);
            System.out.printf("R2 = %.5f\n",bhaskaraMenos);
        }

        scanner.close();
        

    }
    
}
