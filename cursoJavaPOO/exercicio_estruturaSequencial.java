package cursoJavaPOO;
import java.util.Locale;

public class exercicio_estruturaSequencial {

	public static void main(String[] args) {
		
		/* formtação de valores (double) e string para retorno  */
		
		String produto1 = "Computador";
		String produto2 = "Mesa Escritorio";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double tamanho = 58.548627;
		
		System.out.printf("Produtos: %n%s, por R$%.2f %n%s, por %.2f%n", produto1, preco1, produto2, preco2);
		System.out.printf("%nCadastro: %d Anos, codigo %d e genero: %S %n", idade, codigo, genero);
		System.out.printf("%nTamanho com oito casas decimais: %.8f %nAprox. (3 casas decimais): %.3f", tamanho, tamanho);
		Locale.setDefault(Locale.US);
		System.out.printf("%nDivisor de decimais US: %.3f", tamanho);
		
		
		
		

	}

}
