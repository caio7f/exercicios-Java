package cursoJavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		/* (If/else) - Leia o código de um item e a quantidade deste item. A
		seguir, calcule e mostre o valor da conta a pagar.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		int qte = sc.nextInt();
		
		double valor = 0;
		
		if (id == 1) {
			valor = qte * 4.00;
		}
		else if (id == 2) {
			valor = qte * 4.50;
		}
		else if (id == 3) {
			valor = qte * 5.00;
		}
		else if (id == 4) {
			valor = qte * 2.00;
		}
		else if (id == 5) {
			valor = qte * 1.50;
		}
				
		System.out.printf("Total: R$ %.2f%n", valor);
		
		sc.close();
	}

}
