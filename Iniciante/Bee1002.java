package Iniciante;
/*beecrowd | 1002 troca classe para Main, para passar*/
import java.util.Scanner;
public class Bee1002{
    
    public static void main(String[] args)   {
        double pi = 3.14159;
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        double area = pi*raio*raio; 
        System.out.printf("A=%.4f\n", area);
        scanner.close();
    }
}
