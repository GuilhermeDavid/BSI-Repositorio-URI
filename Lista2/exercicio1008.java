//Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário

package lista2_URI;

import java.util.Scanner;

public class exercicio1008 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
    
        int numfunc, horas;

        double salariohora, salariototal;

        System.out.print("Numero do funcionario: ");
         numfunc = leitor.nextInt();

        System.out.print("Horas trabalhadas: ");
         horas = leitor.nextInt();
        
        System.out.print("Valor que este funcionario recebe por hora: ");
         salariohora = leitor.nextDouble();

         salariototal = salariohora * horas;

        System.out.println("Funcionario " + numfunc);
        System.out.println("Recebe R$ " + String.format("%.2f", salariototal));

        leitor.close();

    }   
}
