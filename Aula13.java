package curso;

import java.util.Scanner;

public class Aula13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/*
		 * 	Composta com apenas if e else			
		 * 
		 *  System.out.println("Enter an integer number: ");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Even!");
		}else {
			System.out.println("Odd!");
		}
		*/
		
		System.out.println("What time is it? ");
		int time = sc.nextInt();
		
		if(time < 12) {
			System.out.println("Good Morning!");
		}else if(time>= 12 && time < 18) {
			System.out.println("Good Afternoon!");
		}else if(time >= 18){
			System.out.println("Good Evening!");
		}else {
			System.out.println("Tente novamente!");
		}
		
		sc.close();
	}

}
