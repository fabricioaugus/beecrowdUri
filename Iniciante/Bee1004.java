package Iniciante;
/*beecrowd | 1004 troca classe para Main, para passar, Tira nome do package*/
import java.util.Scanner;
public class Bee1004 {

    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int prod =  num1*num2;
        System.out.printf("PROD = %d\n",prod);
        scanner.close();
    }
    
}
