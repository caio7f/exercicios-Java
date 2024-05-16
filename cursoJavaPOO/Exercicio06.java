package cursoJavaPOO;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		/*(If/Else) - Fazer um programa para ler um número inteiro, 
		 * e depois dizer se este número é negativo ou não.*/
		
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		if (valor >= 0) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}
		
		sc.close();
	}

}
