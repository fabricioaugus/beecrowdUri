package Iniciante;
/*beecrowd | 1010 troca classe para Main, para passar, Tira nome do package*/
import java.util.Scanner;
public class Bee1010 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        int codPeca = scanner.nextInt();
        int numDePecas = scanner.nextInt();
        Double valorUnitario = scanner.nextDouble();
        int codPeca2 = scanner.nextInt();
        int numDePecas2 = scanner.nextInt();
        Double valorUnitario2 = scanner.nextDouble();
        double valorPago = valorUnitario*numDePecas;
        double valorPago2 = valorUnitario2*numDePecas2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorPago+valorPago2);
    scanner.close();
    
   }
}
