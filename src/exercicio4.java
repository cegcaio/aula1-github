import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario = sc.nextInt();
		int horasTrab = sc.nextInt();
		double salarioHora = sc.nextDouble();
		double salarioTotal = horasTrab * salarioHora;
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = %.2f%n", salarioTotal);
		


		sc.close();
		
	}

}
