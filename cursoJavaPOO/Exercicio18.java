package cursoJavaPOO;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		/*(If/Else) - Indicador de quadrante no plano cartesiano versão 2*/
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 & y != 0) {
			if (x > 0 & y > 0) {
				System.out.println("Q1");
			}
			else if (x < 0 & y > 0)	{
				System.out.println("Q2");
			}
			else if (x < 0 & y < 0)	{
				System.out.println("Q3");
			}	
			else {
				System.out.println("Q4");
			}	
			
			x = sc.nextInt();
			y = sc.nextInt();
				
		}
		
		sc.close();
	}
}
