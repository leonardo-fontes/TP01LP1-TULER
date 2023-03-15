/*12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */


import java.util.Scanner; 

public class TP01Ex12 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a altura do Cone: ");
        double alt = leitor.nextDouble();

        System.out.print("Digite o raio do cone: ");
        double raio = leitor.nextDouble();

        double areabase = 3.14 * (raio * raio); 

        double result = (areabase * alt) /3; 

        System.out.print(result);

    }
}
