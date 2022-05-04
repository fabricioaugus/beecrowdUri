package Iniciante;
/* beecrowd | 1037 troca classe para Main, para passar, Tira nome do package */
import java.util.Scanner;

public class Bee1037 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double numLido = scanner.nextDouble();
    if (numLido>=0.00 && numLido <=  25.0000000){
        System.out.println("Intervalo [0,25]");
    }else if(numLido>25.0000000 && numLido <= 50.0000000){
        System.out.println("Intervalo (25,50]");
    }else if(numLido>50.0000000 && numLido <= 75.0000000){
        System.out.println("Intervalo (50,75]");
    }else if(numLido>75.0000000 && numLido <= 100.0000000){
        System.out.println("Intervalo (75,100]");
    }else{
        System.out.println("Fora de intervalo");
    }
    scanner.close();
}
}
