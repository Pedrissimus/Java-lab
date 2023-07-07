package mediasalarial;

import java.util.Scanner;

public class msalario {

  public static void main(String[] args) {
    Scanner dados = new Scanner(System.in);

    int n = 4; 
    int v[] = new int[n]; 
    int i;
    int media = 0;
    

// Entrada de Dados
    for (i=0; i<n; i++) {
  
      System.out.printf("Informe o %2do. Salario de %d: ", (i+1), n);
      v[i] = dados.nextInt();
      
      media = media + v[i];
      
      
    }
    
    for(i=0; i < 4; i++) {
    	
    	System.out.println("Salario " + (i+1) + ":" + v[i] + "\n");
    	
    	
    	
    	
    }
    
    
	
	System.out.println("A media salarial e: " + media/4 + "\n");

  }
}	
	


