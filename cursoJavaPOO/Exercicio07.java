package cursoJavaPOO;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		/*(If/Else) - Leitor de numeros pares ou impares*/
		
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		if (valor%2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
		
		
		
		
		
		
		sc.close();
	}

}
