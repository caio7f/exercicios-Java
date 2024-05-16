package cursoJavaPOO;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		/*(For + If/Else) - Ler um numero X e somar os valores digitados
		 * a seguir, até que a quantidade de valores digitados 
		 * seja igual a X*/

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int in = 0, out = 0, x2 = 0;
		
		for (int i=0; i<x; i++) {
			x2 = sc.nextInt();
			if (x2 >= 10 && x2 <= 20) {
				in += 1;
			}
			else {
				out +=1;
				}
		}
		
		System.out.printf("In: %d%nOut: %d%n", in, out);
		
		sc.close();
	}

}
