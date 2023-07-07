package Grausjava;

import java.util.Scanner;

public class Graus {
	
	public static void main (String []args) {
		
	double f;
	double k;
	double re;
	double ra;
	int c;
	
	System.out.println("Digite a temperatura da sua cidade hoje (Em Celsius)");
	
	try (Scanner grau = new Scanner(System.in)) {
		c = grau.nextInt();
	}
	
	System.out.println(c);
	
	f = c * 1.8 + 32;
	
	k = c + 273.15;
	
	re = c * 0.8;
	
	ra = c * 1.8 + 32 + 459.67;
	
	System.out.println("A temperatura equivalente em Fahrenheit:");
	System.out.println(f);
	
	System.out.println("A temperatura equivalente em Kelvin:");
	System.out.println(k);
	
	System.out.println("A temperatura equivalente em Réaumur:");
	System.out.println(re);
	
	System.out.println("A temperatura equivalente em Rankine:");
	System.out.println(ra);
	
	
	
		
		
		
		
			
		
	}

}
