package cursoJavaPOO;

public class Exercicio15 {

	public static void main(String[] args) {
		
		// Expressão condicional ternária
		
		double valor = 34.45;
		double desconto = (valor < 20.00) ? valor * 0.1 : valor * 0.05;
		
		System.out.printf("%.2f", desconto);
		
	}

}
