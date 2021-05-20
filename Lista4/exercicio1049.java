/* Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.  
Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.
*/

package Lista4_URI;

import java.util.Scanner;

public class exercicio1049 {
    public static void main(String[] args) {
		
        Scanner leitor = new Scanner(System.in);
		
        System.out.print("Palavra 1: ");
        String palavra1 = leitor.next();
		
        System.out.print("Palavra 2: ");
        String palavra2 = leitor.next();
		
        System.out.print("Palavra 3: ");
        String palavra3 = leitor.next();
		

        if (palavra1.equalsIgnoreCase("vertebrado")) {
		
            if (palavra2.equalsIgnoreCase("ave")) {
		
                if (palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("aguia");
		
                } else {
					System.out.println("pomba");
		
                }
		
            } else {
		
                if (palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("homem");
		
                } else {
					System.out.println("vaca");
				}
			}
		
        } else {
		
            if (palavra2.equalsIgnoreCase("inseto")) {
		
                if (palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
		
                } else {
					System.out.println("lagarta");
				}
		
            } else {
		
                if (palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("sanguessuga");
		
                } else {
					System.out.println("minhoca");
				}			
			}
		}
                leitor.close();
    }
	
}

