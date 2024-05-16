package cursoJavaPOO;

import java.util.Scanner;

public class Exercicio00 {

	public static void main(String[] args) {
		/* Faça um programa para ler dois valores inteiros, 
		e depois mostrar na tela a soma desses números com uma 
		mensagem explicativa, conforme exemplos.*/
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Valor A: ");
		a = sc.nextInt();
		System.out.println("Valor B: ");
		b = sc.nextInt();
		
		c = a + b;
		
		System.out.printf("Resultado: " + c);
		
		
		sc.close();
	}

}
