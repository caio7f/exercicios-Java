package cursoJavaPOO;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		/* (for) - Ler um numero (x) e indicar todos o valores impares 
		  até (x)*/

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i % 2 !=0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		sc.close();
	}

}
