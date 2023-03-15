/* 3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */


import java.util.Scanner; 

public class TP01Ex03 {

	public static void main(String[] args){

		Scanner leitor = new Scanner(System.in);  

	

		System.out.print("Digite o valor da diagonal do quadrado: ");
		int diag = leitor.nextInt();

		int result = (diag * diag) /2 ;   

		System.out.print(result);	

}
}