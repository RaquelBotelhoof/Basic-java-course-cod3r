package fundamentos.exercicios;

import java.util.Scanner;

public class Potenciacao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double valor = entrada.nextDouble();
		
		double quadrado =  Math . pow (valor, 2 );
		double cubo =  Math . pow (valor, 3 );
		
		System.out.println("O valor ao quandrado é: " + quadrado + "\n O valor ao cubo é: " + cubo);
		
	
		entrada.close();
	}
}
