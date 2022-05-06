package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		//calcule a media das notas de uma turma
		//usuario vai digitar uma nota valida >= 0 && <=10
		//criar uma variavel total que armazene as notas
		//uma variavel contadora
		//programa termina quando usario digita -1
		
		Scanner entrada = new Scanner(System.in);

		int cont = 0;
		double nota = 0;
		double total =0;
		
		while(nota != -1) {
			System.out.println("Digite uma nota (ou -1 para sair): ");
			nota = entrada.nextDouble();
			
			if(nota>=0 && nota<=10) {
				total += nota;
				cont++;		
			}else if(nota != -1) {
				System.out.println("Informe uma nota válida.");
			}			
		}
		double media = total / cont;
		System.out.printf("A média dos %d alunos(as) é %.2f",cont, media);
		entrada.close();
	}
}
