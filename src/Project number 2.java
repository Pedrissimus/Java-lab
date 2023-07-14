import java.util.Scanner;

public class Ex2 {
	
	public static void main (String[]args) {
		
		int n = 10;
		int v[] = new int[n];
		int i;
	    int x;
	    
	    Scanner ioup = new Scanner(System.in);
	
	for(i = 0; i < 10; i ++) { 
		
		System.out.println("Digite apenas numeros impares para armazenar no vetor:\n");
		
		x = ioup.nextInt();
		
		if((x % 2) !=0) {
			
	    v[i] = v[i] + x;
			
		
			
		}
		
		else { 
			
			System.out.println("Voce digitou um numero fora dos padroes.\n");
			
			return;
			
			
			
		}
		
		
		
		
		
	}
	
    for(i = 0; i < n; i ++) {
		
    	System.out.println("Numero " +i+ ":");
	System.out.println(v[i]);		
		
			
		}
    	
		
		
		
	}
	
	
	}
