	/* 1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */
	import java.util.Scanner; 

public class TP01Ex01{


	    public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int base; 
		int alt; 
		 
		System.out.println("Digite a base do triangulo");		
		base = leitor.nextInt();
			
		System.out.println("Digite a altura do triangulo");		
		alt = leitor.nextInt();
		
		int result = base * alt;
		
		System.out.print(result);
	
    }

}