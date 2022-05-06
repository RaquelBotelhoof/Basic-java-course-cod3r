package fundamentos;

import java.util.Date;

public class Import {
	
	public static void main(String[] args) {
		
/*Nem tudo está disponivel na versão mais básica, as vezes é preciso importar
como por exemplo o "Date" abaixo. A função mostra a data atual mais é preciso importa-la.*/
		java.lang.String b = "Boa Tarde!";
		java.lang.System.out.println(b);
		
		String s = "Bom dia!!!";
		System.out.println(s);
		
		Date d = new Date();
		System.out.println(d);
		
		
	}
}
