/* 10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit.
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */



import java.util.Scanner;

public class TP01Ex10{

	public static void main(String[] args){

	Scanner leitor = new Scanner(System.in);
	
	System.out.print("Digite o valor em grau celsius");
	double celsius = leitor.nextDouble();

	double result = (celsius * 9/5) + 32;

	System.out.print(result);
	
}
}