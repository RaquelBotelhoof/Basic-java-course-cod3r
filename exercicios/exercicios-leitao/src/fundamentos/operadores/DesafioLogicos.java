package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Você trabalhou Terça (true ou false)?");
		boolean trabalhoTerca = entrada.nextBoolean();
		System.out.println("Você trabalhou quinta (true ou false)?");
		boolean trabalhoQuinta = entrada.nextBoolean();

		boolean comprouTV50 = trabalhoTerca && trabalhoQuinta;
		boolean comprouTV32 = trabalhoTerca ^ trabalhoQuinta;
		boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;
		boolean maisSaudavel = !comprouSorvete; // Operador unário

		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Comprou sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);

		entrada.close();
	}
}
