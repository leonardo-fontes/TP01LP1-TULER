/* 11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */


import java.util.Scanner; 

public class TP01Ex11 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do diâmetro do círculo: ");
        double diam = leitor.nextDouble();

        double raio = diam /2; 

        double result = 3.14 * (raio * raio) ;
        System.out.print(result); 

    }
}