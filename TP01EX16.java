/*16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */


import java.util.Scanner;
import java.lang.Math;

public class TP01EX16 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		double anguloGrau, anguloRad;

		System.out.print("Digite um ângulo em graus: ");
		anguloGrau = ler.nextDouble();

		anguloRad = Math.toRadians(anguloGrau);

		double seno = Math.sin(anguloRad);
		double cosseno = Math.cos(anguloRad);
		double tangente = Math.tan(anguloRad);
		double secante = 1 / cosseno;

		System.out.println("Ângulo: "+anguloGrau+" graus");
		System.out.printf("Seno: %.2f %n", seno);
		System.out.printf("Cosseno: %.2f %n", cosseno);
		System.out.printf("Tangente: %.2f %n", tangente);
		System.out.printf("Secante: %.2f %n", secante);
	}
}