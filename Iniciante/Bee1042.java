
package Iniciante;
/* beecrowd | 1042 troca classe para Main, para passar, Tira nome do package */
import java.util.Scanner;
public class Bee1042{
	
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int valor1 = entrada.nextInt();
        int valor2 = entrada.nextInt();
        int valor3 = entrada.nextInt();
        if(valor1 < valor2 && valor1 < valor3){
            System.out.printf("%d\n", valor1);
            if(valor2<valor3){
                System.out.printf("%d\n%d\n",valor2,valor3);
            }else{
                System.out.printf("%d\n%d\n",valor3,valor2); 
            }
        }else if(valor2 < valor1 && valor2 < valor3){
            System.out.printf("%d\n", valor2);
            if(valor1 < valor3){
                System.out.printf("%d\n%d\n",valor1,valor3);
            }else{
                System.out.printf("%d\n%d\n",valor3,valor1);
            }
        }else{
                System.out.printf("%d\n", valor3);
                if(valor1<valor2){
                    System.out.printf("%d\n%d\n",valor1,valor2);
                }else{
                    System.out.printf("%d\n%d\n",valor2,valor1);
                }
            }
            System.out.printf("\n%d\n%d\n%d\n",valor1,valor2,valor3);
            entrada.close();
        }
}