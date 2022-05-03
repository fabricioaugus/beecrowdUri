package Iniciante;

import java.util.Scanner;

/*beecrowd | 1008 troca classe para Main, para passar, Tira nome do package*/
public class Bee1008 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numFuncionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        float valorPHora = scanner.nextFloat();
        float salarioFuncionario =  horasTrabalhadas*valorPHora;
        System.out.printf("NUMBER = %d\n", numFuncionario);
        System.out.printf("SALARY = U$ %.2f\n",salarioFuncionario);
        scanner.close();

    }
    
}
