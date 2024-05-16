package cursoJavaPOO;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		/* (While) Leitor de senha simples */
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x != 2002) {
			System.out.println("Senha invalida");
			x = sc.nextInt();
		}
		
		System.out.println("Senha valida");
		
		sc.close();
	}

}
