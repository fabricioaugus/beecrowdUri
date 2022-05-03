package Iniciante;
/*beecrowd | 1012 troca classe para Main, para passar, Tira nome do package*/
import java.util.Scanner;

public class Bee1012 {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float ladoA = scanner.nextFloat(); 
        float ladoB = scanner.nextFloat(); 
        float ladoC= scanner.nextFloat(); 
        double pi= 3.14159;
        double trianguloRetangulo = (ladoA*ladoC)/2;
        double areaCirculo = Math.pow(ladoC,2)*pi;
        double  areaTrapezio = ((ladoA+ladoB)*ladoC)/2;
        double areaQuadrado = Math.pow(ladoB,2);
        double areaRetangulo = ladoA*ladoB;

        System.out.printf("TRIANGULO: %.3f\n",trianguloRetangulo);
        System.out.printf("CIRCULO: %.3f\n",areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n",areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n",areaRetangulo);
        scanner.close();
    }
    
}
