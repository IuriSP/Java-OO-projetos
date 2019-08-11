package curso;

public class Aula07 {

	public static void main(String[] args) {
		/*
		 * Operadores de atribuição
		 * 
		 *| Operador |  Exemplo | Significado  |
		 * 	  =			a = 10;	a RECEBE 10;
		 * 	 +=			a += 2;	a RECEBE a + 2;
		 * 	 -=			a -= 2;	a RECEBE a - 2;	
		 * 	 *= 		a *= 2;	a RECEBE a * 2;
		 * 	 /=			a /= 2;	a RECEBE a / 2;
		 * 	 %=			a %= 3; a RECEBE a % 3;
		 */
		
		
		double n1 = 10;
		 n1 = n1 *2;
		System.out.println(n1);
		
		// a++ e ++a
		
		int a = 10;
		int b = a++;
		
		System.out.println(a);
		System.out.println(b);
	}

}
