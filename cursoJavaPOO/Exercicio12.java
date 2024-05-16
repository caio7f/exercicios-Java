package cursoJavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		/*(If/Else) - Indicador de quadrante no plano cartesiano*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		if(x1 == 0 && y2 == 0) {
			System.out.println("Origem");
		}
		else if(x1 >= 0 && y2 >= 0) {
			System.out.println("Q1");
		}
		else if(x1 <= 0 && y2 >= 0) {
			System.out.println("Q2");
		}
		else if(x1 <= 0 && y2 <= 0) {
			System.out.println("Q3");
		}
		else if(x1 >= 0 && y2 <= 0) {
			System.out.println("Q4");
		}
				
		sc.close();
	}

}
