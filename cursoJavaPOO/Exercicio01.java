package cursoJavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/* Faça um programa para ler o valor do raio de um círculo
		e depois mostrar o valor da área deste círculo com quatro 
		casas decimais */
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double pi = 3.14159;
		double raio;
		
		System.out.printf("Raio: ");
		raio = sc.nextDouble();
		
		double area = pi*Math.pow(raio, raio);
	
		System.out.printf("A= %.4f%n", area);
			
		sc.close();
	}

}
