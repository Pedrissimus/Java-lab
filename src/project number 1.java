import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[]args) {
	
		int n = 12; 
	    int v[] = new int[n]; 
	    int i,x,y, soma;
	    
	    Scanner ler = new Scanner(System.in);
	    
	    for(i = 0; i < v.length; i++) {
	    	
	    	System.out.println("Digite um numero para armazenar no vetor\n");
	    	
	    	v[i] = ler.nextInt();	    	
	    }	    
	    System.out.println("Digite a posicao (0...11) a ser buscada no vetor:\n");
	    
	    x = ler.nextInt();
	    
	    System.out.println("Digite outra posicao (0...11) a ser buscada no vetor:\n\n");
	    
	    y = ler.nextInt();
	    
	    System.out.println("Posicao x:\n"); 
	    
        System.out.println(v[x]);
        
        System.out.println("Posicao y:\n\n"); 
	    
        System.out.println(v[y]);
		
		soma = v[y] + v[x];
		
		System.out.println("Soma das duas posicoes:\n" + soma );
	}

}
