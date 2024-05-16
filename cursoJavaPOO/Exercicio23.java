package cursoJavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		/* (For) - Fazer um programa para ler um número N. 
		 * Depois leia N pares de números e mostre a divisão 
		 * do primeiro pelo segundo. Se o denominador for igual 
		 * a zero, mostrar a mensagem "divisao impossivel".*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i=0; i<x; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (b!=0) {
				double div = (double) a/b;
				System.out.println(div);
			}
			else System.out.println("NOP");
			}
			
		sc.close();
}
}



