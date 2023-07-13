package gpt;

import java.util.Scanner;

public class ex3 {
	
	public static void main (String []args) {
		
		int a = 0, b = 0, c = 0;
		int i;
		
		Scanner n = new Scanner (System.in);
		
		for(i = 0; i < 1; i ++) { 
			
			System.out.println("Digite o primeiro numero:");
			a = n.nextInt(); 
			
			System.out.println("Digite o segundo numero:");
			b = n.nextInt(); 
			
			System.out.println("Digite o terceiro numero:");
			c = n.nextInt();
					
			}
		
		if(a > b && a > c) {
			System.out.println(a + " is bigger than " + b + " and " + c);
		}
		else if(b > a && b > c) {
			System.out.println(b + " is bigger than " + a + " and " + c);
		}
		
		else if(c > a && c > b) {
			System.out.println(c + " is bigger than " + a + " and " + b);
		}
		
	}

}
