package gpt;

import java.util.Scanner;

public class ex5 {
	
	public static void main (String[]args) {
		
		String letra;
		
		Scanner l = new Scanner (System.in);
		
		System.out.println("Write a letter for verify if is a vowel or consonant:");
		
		letra = l.next();
		
		if (letra.equals("a")  || letra.equals("e")  || letra.equals("i")  || letra.equals("o")  || letra.equals("u")) {
			
			System.out.println(letra + ":" + " This letter is a vowel.");
		}
		
		else {
			System.out.println(letra + ":" + " This letter is a consonant.");
			
		}
		
	}

}
