package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		
		double media = 3.6;
	
		String resultado = media >= 7.0 ?"Aprovado" : media >= 5.0 ? "Recupera��o" : "Reprovado";
		
		System.out.println("O aluno est�: " + resultado);
		
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouMedia = nota >=7;
		boolean desconto = bomComportamento && passouMedia;
		String resultadoFinal = desconto ? "sim" : "n�o";
		
		System.out.println("\nTem desconto? " + resultadoFinal );
	}
}
