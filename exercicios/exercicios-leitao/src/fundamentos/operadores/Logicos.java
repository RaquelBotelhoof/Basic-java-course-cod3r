package fundamentos.operadores;

public class Logicos {

		public static void main(String[] args) {
			
			boolean cond1 = true;
			boolean cond2 = 3 > 7;
			
			System.out.println(cond1 && !cond2);
			System.out.println(cond1 || cond2);
			System.out.println(cond1 ^ cond2);
			System.out.println(!!cond1);
			System.out.println(!cond2);
			
			System.out.println("\nTabela verdade E (AND)");
			System.out.println(true && true);
			System.out.println(true && false);
//			System.out.println(false && true);
//		    System.out.println(false && false);
			
			System.out.println("\nTabela verdade OU (OR)");
//		    System.out.println(true || true);
//			System.out.println(true || false);
			System.out.println(false || true);
			System.out.println(false || false);
			
			System.out.println("\nTabela verdade OU Exclusivo ou (XOR) ");
			System.out.println(true ^ true);
			System.out.println(true ^ false);
			System.out.println(false ^ true);
			System.out.println(false ^ false);
			
			System.out.println("\nTabela verdade N�O (NOT) ");
			System.out.println(!true);
			System.out.println(!false);
		
		}
}
