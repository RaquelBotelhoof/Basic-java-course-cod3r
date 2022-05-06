package fundamentos.exercicios;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso em KG: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite sua altura em m2: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		
		System.out.println("IMC: " + imc);
		
		entrada.close();
	}
}
