package cursoJavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		// (For) - Calculadora de media
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 5.0 )/ 10;
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}

}
