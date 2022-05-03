package Iniciante;

import java.util.Scanner;

/*beecrowd | 1006 troca classe para Main, para passar, Tira nome do package*/
public class Bee1006 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int pesoNotaA= 2;
        int pesoNotaB= 3;
        int pesoNotaC= 5;
        float notaA = scan.nextFloat();
        float notaB = scan.nextFloat();
        float notaC = scan.nextFloat();
        Float media = ((pesoNotaB*notaB)+(pesoNotaA*notaA)+(notaC*pesoNotaC))/(pesoNotaA+pesoNotaB+pesoNotaC);
        System.out.printf("MEDIA = %.1f\n", media);
        scan.close();
    }
    
}
