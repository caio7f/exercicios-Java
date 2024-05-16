package cursoJavaPOO;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		/*(If/Else) - Indicador de tempo de jogo em formato 24h dia*/

		Scanner sc = new Scanner(System.in);

		int horaInicio = sc.nextInt();
		int horaFim = sc.nextInt();
		
		int tempo;
		
		if (horaInicio < horaFim) {
			tempo = horaFim - horaInicio;
		}
		else {
			tempo = 24 - horaInicio + horaFim;
		}
		
		System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
		
		sc.close();
		
	}

}
