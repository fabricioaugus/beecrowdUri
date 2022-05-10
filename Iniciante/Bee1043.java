package Iniciante;
/* beecrowd | 1043 troca classe para Main, para passar, Tira nome do package */
import java.util.Scanner;

public class Bee1043 { 
    public static void main(String[] args){
        
        
        Scanner entrada = new Scanner(System.in);
        
        double ladoA = entrada.nextDouble();
        double ladoB = entrada.nextDouble();
        double ladoC = entrada.nextDouble();
        
        if(ladoA < (ladoB+ladoC) && ladoB < (ladoA+ladoC) && ladoC < (ladoA+ladoB)){   
          double perimetroTriangulo = ladoA+ladoB+ladoC;
            System.out.printf("Perimetro = %.1f\n",perimetroTriangulo);
             
        }else{
            
            double areaTrapezio= ((ladoA+ladoB)*ladoC)/2;
            System.out.printf("Area = %.1f\n",areaTrapezio);
            
        }
        entrada.close();
    }
    
}
