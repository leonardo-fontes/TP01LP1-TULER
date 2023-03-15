/* 2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado.
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */
	import java.util.Scanner; 

class TP01Ex02 {
	
    public static void main(String[] args) {

      Scanner leitor = new Scanner(System.in);
	
	System.out.print("Digite o tamanho da aresta: ");
	int aresta = leitor.nextInt();
	
	int result = aresta * aresta; 
	
	System.out.println(result);   
				
    }

}