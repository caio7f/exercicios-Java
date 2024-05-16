package cursoJavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		/* Simplifique função: a/b-c/d*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int a, b, c, d;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		int resultado = (a*b-c*d);
		
		System.out.println(resultado);
		
		sc.close();
	}

}
