package Iniciante;
/* beecrowd | 1020 troca classe para Main, para passar, Tira nome do package */
import java.util.Scanner;

public class Bee1020 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numDia =scanner.nextInt();
        int anoCompleto = numDia/365;
        int restanoCompleto = numDia%365;
        int numMes=restanoCompleto/30;
        int resnumMes=restanoCompleto%30;
        int numDias = resnumMes;


        System.out.println(anoCompleto+" ano(s)");
        System.out.println(numMes+" mes(es)");
        System.out.println(numDias+" dia(s)");
        scanner.close();
    }

}
