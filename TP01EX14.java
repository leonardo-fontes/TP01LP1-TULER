/*14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados.
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */


import java.util.Scanner;
import java.lang.Math;

public class TP01EX14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double aresta;

		do {
			System.out.print("Valor da aresta do cubo: ");
			aresta = ler.nextDouble();
		} while (aresta <=0); // nao existe comprimento negativo ou zero
		
		double raio;

		do {
			System.out.print("Digite o raio: ");
			raio = ler.nextDouble();

			if(raio > (aresta/2))
				System.out.println("O valor do raio deve ser no máximo METADE da aresta.");

		} while (raio > (aresta/2)); // raio precisa ser no maximo a metade da aresta para a esfera caber no cubo

		double volumeCubo = Math.pow(aresta, 3);
		double volumeEsfera = (4 * Math.PI * Math.pow(raio, 3)) / 3;

		System.out.printf("Volume livre: %.2f", (volumeCubo - volumeEsfera));
	}
}