package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		double base = entrada.nextDouble();
		
		System.out.println("Digite a altura: ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) /2;
		
		System.out.println("A area do Tri�ngulo �: " + area);
	
		
		entrada.close();
	}
}
