package Iniciante;

import java.util.Scanner;

/*beecrowd | 1007 troca classe para Main, para passar, Tira nome do package*/
public class Bee1007 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();
        int valorC = scanner.nextInt();
        int valorD = scanner.nextInt();
        int diferenca = ((valorA*valorB)-(valorC*valorD));
        System.out.printf("DIFERENCA = %d\n",diferenca); 
        
        scanner.close();
    }
    
}
