package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a'; // não recomendável
		
		System.out.println(a == b);
		System.out.println(30 != 7);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean media = nota >=7;
		boolean desconto = bomComportamento && media;
		
		System.out.println("\nTem desconto? " + desconto );
		
		
	}
}
