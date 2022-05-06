package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
//Aula : Tipos primitivos
		//Exemplo : informa��es de um funcionario
		
		//Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 5678;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //false ou true
		
		//Tipo caractere
		char status = 'A'; //exemplo: A == ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//N�mero de viagens
		System.out.println(numeroDeVoos /2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salario);
		
		System.out.println("F�rias? "+estaDeFerias);
		
		System.out.println("Status: "+ status);
		
	}
}
