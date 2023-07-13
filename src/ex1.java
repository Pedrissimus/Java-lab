package gpt;

public class ex1 {
	
	public static void main (String []args) {
		
		int[] v = new int[101];
		int i;
		
		System.out.println("Contagem:\n");
		
		for(i = 0; i < 101; i ++) { 
				
		    v[i] = v[i] + i;
						
			}
		
		for(i = 0; i < 101; i ++) { 
			
			System.out.println("Contando:\n" + v[i]);
						
			}
		
	}

}
