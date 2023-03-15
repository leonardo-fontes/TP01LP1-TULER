/* 7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */



import java.util.Scanner;
import java.lang.Math;


public class TP01Ex07 {

	public static void main(String[] args){

	Scanner leitor = new Scanner(System.in);

	System.out.print("Digite o primeiro valor: ");
	double v1 = leitor.nextDouble();

	System.out.print("Digite o segundo valor: ");
	double v2 = leitor.nextDouble();

	double result = Math.sqrt(v1 * v2);

	System.out.print(result); 
}
}