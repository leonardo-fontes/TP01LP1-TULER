/*18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.
	Dupla: Alisson de Sousa Vieira
			Leonardo de Fontes Nunes
	 */


import java.util.Scanner; 

public class TP01Ex18 {
 
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        int[] produtos = new int[5];
            int total = 0;
        for (int i = 0; i < produtos.length; i++){

            System.out.print("Digite o valor do produto: ");
             produtos[i] = leitor.nextInt();
              total += produtos[i]; 
        }

        System.out.println("O valor da sua compra é: " + total);
        System.out.print("Digite quanto você disponibilizará para pagamento: ");
        int pagamento = leitor.nextInt();
        int result = pagamento - total; 
        
        System.out.print("Seu troco é: " + result);
    }
}
