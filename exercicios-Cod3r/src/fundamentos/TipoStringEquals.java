package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		//Quando comprar Strings o melhor � usando o equals
		
		System.out.println("2" == "2");
		
		String s = new String ("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));//.trim() tira os espa�os em branco
		                                          // next tamb�m tira, porem nextLine n�o
		
		entrada.close();
	}
}
