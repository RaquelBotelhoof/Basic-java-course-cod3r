package fundamentos;

public class PrimitivosVsObjeto {

	public static void main(String[] args) {
			
/* No momento em que vc cria uma classe associado ao um valor dizemos que esse valor � um objeto.
E esse objeto colocando a nota��o "." tem atribultos e comportamentos. Exemplo :*/
		
		String s = new String("texto");
		s.toUpperCase();
		
		
/*Em JAVA exixtem 8 tipos primitivos e eles n�o tem atribultos e comportamentos, carregam apenas o valor atribuido.
 Todo o restante em java s�o objetos */
		int a = 123;
		System.out.println(a);
		
/* Se precisar que algum valor n�merico tenha comportamentos associados existe em JAVA os Wrappers 
 (vers�o objeto dos tipos primitos)E para cada tipo primitivo existe um wrapper associado */
		
		
		}
}
