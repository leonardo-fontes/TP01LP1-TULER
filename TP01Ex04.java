/* 4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */


import java.util.Scanner;

public class TP01Ex04 {
	

	public static void main(String[] args){
	
		Scanner leitor = new Scanner(System.in); 

	System.out.print("Digite a base do triangulo: ");
	int base = leitor.nextInt();

	System.out.print("Digite a altura do triangulo: ");
	int altura = leitor.nextInt();
	
	int result = (base * altura) /2;
	System.out.println(result); 
}
}