/*17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */


import java.util.Scanner;
import java.lang.Math; 

public class TP01Ex17 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o valor X: ");
        double x = leitor.nextDouble();

        System.out.print("Digite o valor Y: ");
        double y = leitor.nextDouble();

        double result = Math.pow(x, y); 
        System.out.print(result);
        

    }
}
