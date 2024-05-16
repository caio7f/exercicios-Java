package cursoJavaPOO;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		/*(While + If/Else) Leitor de preferencia de produto*/

		Scanner sc = new Scanner(System.in);
		
		int alcool = 0, gasolina = 0, diesel = 0, x;
		
		x = sc.nextInt();
		
		while (x != 4) {
			if (x == 1) {
				alcool += 1;
			}
			else if (x == 2){
				gasolina += 1;	
				}
			else if (x == 3) {
				diesel += 1;
				}
			
			x = sc.nextInt();		
		}
			
		System.out.printf("Muito Obrigado!%nAlcool: %d%nGasolina: %d%nDiesel: %d%n", alcool, gasolina, diesel);
		sc.close();
	}
}
