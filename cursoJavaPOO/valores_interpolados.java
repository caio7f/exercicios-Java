package cursoJavaPOO;
import java.util.Locale;

public class valores_interpolados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e recebe R$%.2f %n", nome, idade, renda);

	}

}
