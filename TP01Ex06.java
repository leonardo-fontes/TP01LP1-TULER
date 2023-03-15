/* Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados.
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */




import java.util.Scanner;

public class TP01Ex06 {

	public static void main(String[] args){

	Scanner leitor = new Scanner(System.in);

	System.out.print("Digite o primeiro valor: ");
	int v1 = leitor.nextInt();

	System.out.print("Digite o segundo valor: ");
	int v2 = leitor.nextInt();

	System.out.print("Digite o terceiro valor: ");
	int v3 = leitor.nextInt();

	System.out.print("Digite o quarto valor: ");
	int v4 = leitor.nextInt();	

	int media = (v1 + v2 + v3 + v4) / 4; 
	
	System.out.println(media);
}
}