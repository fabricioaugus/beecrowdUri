package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bee1040 {
    public static void main(String[] args){

      Scanner entrada = new Scanner(System.in);
      double nota1 = entrada.nextDouble();
      double nota2 = entrada.nextDouble();
      double nota3 = entrada.nextDouble();
      double nota4 = entrada.nextDouble();
      final double PESO_NOTA_1 = 2;
      final double PESO_NOTA_2 = 3;
      final double PESO_NOTA_3 = 4;
      final double PESO_NOTA_4 = 1;
      DecimalFormat df = new DecimalFormat("0.0");
      double media =((nota1*PESO_NOTA_1)+(nota2*PESO_NOTA_2)+(nota3*PESO_NOTA_3)+(nota4*PESO_NOTA_4))/(PESO_NOTA_1+PESO_NOTA_2+PESO_NOTA_3+PESO_NOTA_4); 
      if (media>=7) {
        System.out.println("Media: "+df.format(media));
        System.out.println("Aluno aprovado.");
      }else if ( media >= 5 && media < 7){
            double notaExame = entrada.nextDouble();
            double novaNota = (notaExame+media)/2;
            if(novaNota>=5){ 
                System.out.println("Media: "+df.format(media));
                System.out.println("Aluno em exame.");
                System.out.println("Nota do exame: "+notaExame);
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: "+df.format(novaNota));  
               
            }else{
                System.out.println("Media: "+df.format(media));
                System.out.println("Aluno em exame.");
                System.out.println("Nota do exame: "+notaExame);
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: "+df.format(novaNota)); 

            }
      }else{
        System.out.println("Media: "+df.format(media));
        System.out.println("Aluno reprovado.");
      }
      
      entrada.close();

    }
}
    
