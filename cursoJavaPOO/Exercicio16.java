package cursoJavaPOO;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		/* (While) Fazer um programa que lê números
		inteiros até que um zero seja lido. Ao
		final mostra a soma dos números lidos.*/
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}
