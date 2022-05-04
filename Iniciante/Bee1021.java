package Iniciante;
/* beecrowd | 1021 troca classe para Main, para passar, Tira nome do package */
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Bee1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double totalDinheiro = scanner.nextDouble();
        int[] notas = { 100, 50, 20, 10, 5, 2 };
        float[] moedas = {  1.00f , 0.50f , 0.25f , 0.10f , 0.05f , 0.01f };
        DecimalFormat df2 = new DecimalFormat("#0.00");
        System.out.println("NOTAS:");
       
        for (int nota : notas) {
            int numDeNotas = (int) (totalDinheiro / nota);
            System.out.printf("%d nota(s) de R$ %d.00\n" , numDeNotas , nota);
            totalDinheiro = totalDinheiro % nota;
           
        }
        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            int moed =  (int) (totalDinheiro / moeda);
            String formm = df2.format(moeda).replaceAll(",", ".");
            System.out.printf("%d moeda(s) de R$ %s\n",moed,formm);
            totalDinheiro = (totalDinheiro % moeda)+0.00001;
        }
        scanner.close();
        
    }
  
}
