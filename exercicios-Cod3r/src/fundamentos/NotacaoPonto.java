package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {

//pode ser usado um de cada vez 
		String s = "Bom dia X";	//String n�o � um tipo primitivo
		s = s.replace("X", "Senhora"); //.replace : usado para substituir
		s = s.toUpperCase();//.toUpperCase : usado para deixar todas letras maiusculas
		s = s.concat("!!!"); // .concat : usado para concatenar 
		
		System.out.println(s);
		
//logo ap�s 
		String x = "Raquel".toUpperCase();
		System.out.println(x);
		
		
//ou tudo junto concatenando com o "." ou quebrar em linhas antes ou depois do "." n�o interfere.
		String y = "Bom dia X".
				replace("X", "Rosa")
				.toUpperCase().concat("!!!");
		System.out.println(y);
		
		
		
	}
}
