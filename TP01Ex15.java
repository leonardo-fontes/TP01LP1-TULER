/*15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */



import java.util.Scanner;

public class TP01Ex15 {
 
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);


        System.out.print("Digite o valor do Dólar ");
        double cota = leitor.nextDouble();

        System.out.print("Digite a quantidade de Dólares ");
        double Dolar = leitor.nextDouble();

        double reais = Dolar * cota; 

        System.out.print(reais);

    }
}
