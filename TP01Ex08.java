/* 8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */


import java.util.Scanner;

public class TP01Ex08 {

	public static void main(String[] args){

	Scanner leitor = new Scanner(System.in);

	double cvmilha = 1.852;
	
	System.out.print("Digite o valor em milhas: ");
	double milha = leitor.nextDouble();

	double result = cvmilha / milha; 
	System.out.print(result);		
			
}
}