/* 5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */


import java.util.Scanner;
	import java.lang.Math;

public class TP01Ex05 {

	public static void main(String[] args){
	
	Scanner leitor = new Scanner(System.in);

	System.out.print("Digite o diâmetro da esfera: ");
	double diam = leitor.nextDouble();

	double raio = diam /2 ; 

	double V = 4 * Math.PI * Math.pow(raio, 3) /3; 

	System.out.print(V); 
}
}