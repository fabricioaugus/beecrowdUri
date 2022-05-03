package Iniciante;
/*beecrowd | 1009 troca classe para Main, para passar, Tira nome do package*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class Bee1009 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        String nome = scanner.next();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();
        double taxacomissao = 0.15; 
        double totalSalario =salarioFixo+(taxacomissao*totalVendas);
        String formatacao = df.format(totalSalario);
        System.out.println("TOTAL = R$ "+formatacao);
        scanner.close();
    }
    
}
