package gpt;

import java.util.Scanner;

public class ex2 {
	
	public static void main (String[]args) {
	    
		System.out.println("Digite algo para reverter:\n");
	    
		Scanner str = new Scanner(System.in);
		
		String name = str.next();
		char[] chararray = name.toCharArray();
		int comeco = 0;
		int fim = chararray.length - 1;
	
		while (comeco < fim) {
			char temp = chararray[comeco];
		    chararray[comeco] = chararray[fim];
		    chararray[fim] = temp;

		   
		    comeco++;
		    fim--;
			
			
			
		}
		
		String reversedStr = new String(chararray);
		System.out.println("Reversed string: " + reversedStr);
	
	}

}
