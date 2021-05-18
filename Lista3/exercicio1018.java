/* Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) 
no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
A seguir mostre o valor lido e a relação de notas necessárias.
*/

package Lista3_URI;

import java.util.Scanner;

public class exercicio1018 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual valor você deseja sacar? R$");
	    int valor = leitor.nextInt();
	
	    int nota_100 = 100;
	    int nota_50 = 50;
	    int nota_20 = 20;
        int nota_10 = 10;
        int nota_5 = 5;
	    int nota_2 = 2;
        int nota_1 = 1;	

	        if(valor > 0 ) {
		
                if(nota_100 > 0) {
			        nota_100 = valor / 100; 
			        valor = valor % 100;   
			        System.out.println(nota_100 + " nota(s) de 100");
		
                } if(nota_50 > 0) {
			        nota_50 = valor / 50;
			        valor = valor % 50;
			        System.out.println(nota_50 + " nota(s) de 50");
		
                } if (nota_20 > 0) {
                    nota_20 = valor / 20;
                    valor = valor % 20;
                    System.out.println(nota_20 + " nota(s) de 20");
        
                } if(nota_10 > 0) {
			        nota_10 = valor / 10;
			        valor = valor % 10;
			        System.out.println(nota_10 + " nota(s) de 10");
		
                } if(nota_5 > 0) {
			        nota_5 = valor / 5;
			        valor = valor % 5;
			        System.out.println(nota_5 + " nota(s) de 5");
		
                } if (nota_2 > 0) {
                    nota_2 = valor / 2;
                    valor = valor % 2;
                    System.out.println(nota_2 + " nota(s) de 2");
        
                } if(nota_1 > 0) {
			        nota_1 = valor / 1;
			        valor = valor % 1;
			        System.out.println(nota_1 + " nota(s) de 1");
		
                    } else 
		                System.out.println("Não é possível realizar o saque");     
        
                        System.out.println("Obrigado pelo saque, volte sempre ao nosso banco!");
	 
                        leitor.close();
            }   
    }
}   

