package Iniciante;
/* beecrowd | 1038 troca classe para Main, para passar, Tira nome do package */
import java.util.Scanner;

public class Bee1038 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int valorLido = entrada.nextInt();
        int quantidadeDePedido = entrada.nextInt();
        double Total;
        switch (valorLido){
            case 1:
                double precoDoCacharroQuente = 4.00;
                Total = quantidadeDePedido*precoDoCacharroQuente;
                System.out.printf("Total: R$ %.2f\n",Total);
                break;
            case 2:
                double precoXSalada = 4.50;
                Total = quantidadeDePedido*precoXSalada;
                System.out.printf("Total: R$ %.2f\n",Total);
                break;
            case 3:
                double precoXBacon = 5.00;
                Total = quantidadeDePedido*precoXBacon;
                System.out.printf("Total: R$ %.2f\n",Total);
                
                break;
            case 4:
                double precoTorradaSimples = 2.00;
                Total = quantidadeDePedido*precoTorradaSimples;
                System.out.printf("Total: R$ %.2f\n",Total);
                break;
            case 5:
                double precoRefrigerante = 1.50;
                Total = quantidadeDePedido*precoRefrigerante;
                System.out.printf("Total: R$ %.2f\n",Total);
                break;
        }
        entrada.close();
    }
    
}
