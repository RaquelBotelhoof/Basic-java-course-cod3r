package fundamentos.exercicios;

import java.util.Scanner;

public class Temperatura {
 
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Digite a temperatura em grau Fahrenheit: ");	
		double fahrenheit1 = entrada.nextDouble();
		double celcius2 = (fahrenheit1 - 32) /1.8;
		System.out.println("Convertido em Grau Celcius o resultado é: "+ celcius2 + "°C");
		
		
		System.out.println("\nDigite a temperatura em grau Celcius: ");	
		double celcius1 = entrada.nextDouble();	
		double fahrenheit2 = (celcius1*1.8) + 32;
		System.out.println("Convertido em Grau Fahrenheit o resultado é: "+ fahrenheit2 + "°F");
		
		
		entrada.close();
	}
}
