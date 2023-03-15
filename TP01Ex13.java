/*13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */


import java.util.Scanner ;

public class TP01Ex13{

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor da velocidade inicial: ");
        double v0 = leitor.nextDouble();

        System.out.print("Digite o valor da aceleração: ");
        double acel = leitor.nextDouble();

        System.out.print("Digite o tempo de percurso: ");
        double tempo = leitor.nextDouble();

        double vfinal = v0 + acel * tempo; 
        double result = vfinal * 3.6;
        System.out.print(result);
    }
}