package fundamentos;

public class PrimitivosVsObjeto {

	public static void main(String[] args) {
			
/* No momento em que vc cria uma classe associado ao um valor dizemos que esse valor é um objeto.
E esse objeto colocando a notação "." tem atribultos e comportamentos. Exemplo :*/
		
		String s = new String("texto");
		s.toUpperCase();
		
		
/*Em JAVA exixtem 8 tipos primitivos e eles não tem atribultos e comportamentos, carregam apenas o valor atribuido.
 Todo o restante em java são objetos */
		int a = 123;
		System.out.println(a);
		
/* Se precisar que algum valor númerico tenha comportamentos associados existe em JAVA os Wrappers 
 (versão objeto dos tipos primitos)E para cada tipo primitivo existe um wrapper associado */
		
		
		}
}
