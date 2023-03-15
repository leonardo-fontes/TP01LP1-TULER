/* 9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */


import java.util.Scanner;

public class TP01Ex09 {

	public static void main(String[] args){

	Scanner leitor = new Scanner(System.in);

	System.out.print("Digite o valor da resistência: ");
	double resist = leitor.nextDouble();

	System.out.print("Digite o valor da corrente elétrica: ");
	double cel = leitor.nextDouble();	 	
	
	double tensao = resist * cel; 
	System.out.print(tensao);
}
}