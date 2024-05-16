package cursoJavaPOO;
import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		String t1, t2, t3;
		
		x = sc.nextInt();
		sc.nextLine(); //Se você então fizer um nextLine(),aquela quebra de linha pendente será absorvida pelo nextLine().
		t1 = sc.nextLine();
		t2 = sc.nextLine();
		t3 = sc.nextLine();
		
		System.out.println("Retorno:");
		System.out.println(x);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		
		
		sc.close();
	}
}