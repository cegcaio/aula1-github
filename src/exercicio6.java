import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		double pi = 3.14159;
		double areaTria, areaCirc, areaTrap, areaQuad, areaReta;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTria = A * C / 2;
		areaCirc = pi * C * C;
		areaTrap = ((A + B) * C) / 2;
		areaQuad = B * B;
		areaReta = A * B;
		
		System.out.printf("Triangulo: %.3f%n", areaTria);
		System.out.printf("Circulo: %.3f%n", areaCirc);
		System.out.printf("Trapezio: %.3f%n", areaTrap);
		System.out.printf("Quadrado: %.3f%n", areaQuad);
		System.out.printf("Retangulo: %.3f%n", areaReta);

		sc.close();
	}

}
