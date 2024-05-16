package cursoJavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/* Calculadora de horas trabalhadas com leitura de Id de funcionario*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int id;
		double hora, valorh;
		
		id = sc.nextInt();
		hora = sc.nextDouble();
		valorh = sc.nextDouble();
		
		double pagamento = hora*valorh;
		
		System.out.printf("ID: %d%nSalario: U$%.2f%n", id, pagamento);
		
		sc.close();
	}

}
