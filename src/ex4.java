package gpt;

import java.util.Scanner;

public class ex4 {
	
       public static void main (String []args) {
    	   
    	   System.out.println("Please insert a name for verify if is palindrome.");
    	   
    	   String name;
    	   
    	   Scanner p = new Scanner(System.in);
    	   
    	   name = p.next();
    	   
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
   		if (reversedStr.equals(name)) {
   			System.out.println(name + " is palidrome.");
   		}
   		else {
   			
   			System.out.println(name + " isn't palidrome.");
   			
   		}
       }
	
}
