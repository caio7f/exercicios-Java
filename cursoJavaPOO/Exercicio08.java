package cursoJavaPOO;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		/*(If/Else) - Leitor de numeros multiplos*/
		
		Scanner sc = new Scanner(System.in);

		int valor1, valor2;
		
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		
		if (valor1%valor2==0||valor2%valor1==0) {
			System.out.println("Sao multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}
			
		sc.close();
	}

}
