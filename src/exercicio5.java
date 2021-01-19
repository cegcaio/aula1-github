import java.util.Locale;
import java.util.Scanner;


public class exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, numero1, codigo2, numero2;
		double valorUnit1, valorUnit2, valorTotal;
		
		codigo1 = sc.nextInt();
		numero1 = sc.nextInt();
		valorUnit1 = sc.nextDouble();
		
		codigo2 = sc.nextInt();
		numero2 = sc.nextInt();
		valorUnit2 = sc.nextDouble();
		
		valorTotal = (numero1 * valorUnit1) + (numero2 * valorUnit2);
		
		System.out.printf("VALOR A PAGAR: %.2f%n", valorTotal);

		sc.close();
	}

}
