package curso;

import java.util.Scanner;

public class Aula08 {

	public static void main(String[] args) {
		/*
		 * Tipos para entradas no scanner
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int x = sc.nextInt();
		 * double y = sc.nextDouble();
		 * String z = sc.next();
		 * String v = sc.nextLine();
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		
		String x, y, z;
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		
		sc.close();
	}

}
