package Iniciante;
/*beecrowd | 1003 troca classe para Main, para passar*/ 
import java.util.Scanner;
public class Bee1003 {

    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int somaSimples = num1 + num2;
        System.out.printf("SOMA = %d\n", somaSimples);
        scanner.close();
    }
    
}
