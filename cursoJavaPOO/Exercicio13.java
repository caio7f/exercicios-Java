package cursoJavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		/*(If/Else) - Calculadora de imposto de renda composto*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		double imposto = 0;		
		
		if (valor <= 2000.00) {
			imposto = 0.0;
		}
		else if (valor <= 3000.00) {
			imposto = (valor - 2000.00) * 0.08;
		}
		else if (valor <= 4500.00) {
			imposto = (valor - 3000.00) * 0.18 + 1000.00 * 0.08; 
		}
		else {
			imposto = (valor - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08; 
		}
		
		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}

}
