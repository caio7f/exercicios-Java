package cursoJavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler o código de uma peça 1, 
		 * o número de peças 1, o valor unitário de cada peça 1, o
		* código de uma peça 2, o número de peças 2 e o valor 
		* unitário de cada peça 2. Calcule e mostre o valor a ser pago */
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int cp1, cp2, np1, np2;
		double p1, p2, total;
		
		cp1 = sc.nextInt();
		np1 = sc.nextInt();
		p1 = sc.nextDouble();
		
		cp2 = sc.nextInt();
		np2 = sc.nextInt();
		p2 = sc.nextDouble();
		
		total = p1*np1 + p2*np2;
		
		System.out.printf("R$ %.2f%n", total);
		System.out.println(cp1 + cp2);	
		
		sc.close();
	}
}
