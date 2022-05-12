package arrays;

import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {  
		//armazenar e dar a media das notas que o usuario informar
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas notas?");
		
		int qtdeNotas = entrada.nextInt();
		System.out.println("Ok, " + qtdeNotas + " notas.");
		
		double [] notas = new double [qtdeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + " : ");
			notas [i] = entrada.nextDouble(); 
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = (total / notas.length);
		System.out.printf("A média final é :%.2f", media );
		
		entrada.close();
		
		}
}
	
		


