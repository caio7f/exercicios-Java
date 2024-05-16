package cursoJavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		/* (For) - Ler um valor N. Calcular e escrever 
		 * seu respectivo fatorial*/ 
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int y = 1;
		for (int i=1; i<=x; i++) {
			y = y * i;
		}
		System.out.println(y);
		sc.close();
	}

}
