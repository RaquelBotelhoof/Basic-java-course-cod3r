package fundamentos.exercicios;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println( "Equação: ax² + bx + c = 0 ");
		
		System.out.println("Digite o valor de a: ");
		int a = entrada.nextInt();
		
		System.out.println("Digite o valor de b: ");
		int b = entrada.nextInt();
		
		System.out.println("Digite o valor de c: ");
		int c = entrada.nextInt();
		
		int delta = (b * b) - (4 * a * c);
		
		System.out.printf("\n Sua equação é: %dx² + %dx + %d = 0 ", a, b, c);
		
		System.out.println("\n Delta é: " + delta);
		
		double x1 = (- b + Math.sqrt (delta)) / ( 2 * a);
		System.out.printf("\n O x1 da equação é: %.2f ", x1);
		
		double x2 = (- b - Math.sqrt (delta)) / ( 2 * a);
		System.out.printf("\n O x2 da equação é: %.2f ", x2);
		
		entrada.close();
	}
}
