package fundamentos;

import java.util.Date;

public class Import {
	
	public static void main(String[] args) {
		
/*Nem tudo est� disponivel na vers�o mais b�sica, as vezes � preciso importar
como por exemplo o "Date" abaixo. A fun��o mostra a data atual mais � preciso importa-la.*/
		java.lang.String b = "Boa Tarde!";
		java.lang.System.out.println(b);
		
		String s = "Bom dia!!!";
		System.out.println(s);
		
		Date d = new Date();
		System.out.println(d);
		
		
	}
}
