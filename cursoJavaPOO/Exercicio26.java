package cursoJavaPOO;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		/* (For) - Ler um valor X e calcular sua potencia ao quadrado e cubo.
		 * Fazer uma vez por linha até a quantidade de linhas ser igual a X*/
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i =1; i <= x; i++) {
			int i1 = (int) Math.pow(i, 2);
			int i2 = (int) Math.pow(i, 3);
			System.out.printf("%d %d %d%n", i, i1, i2);
		}		
		sc.close();
	}
}
