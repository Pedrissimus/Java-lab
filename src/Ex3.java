import java.util.Scanner;

public class Ex3 {
	
	public static void main  (String []args) {
		
		int i;
		int vetor[] = {1,2,3,4,5,6,7,8,9,10};
	    int n = 10;
		int numero;
	    int n1 = 10;
		int resultado[] = new int [n1];	
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite um numero para receber sua tabuada:\n");
		
		numero = ler.nextInt();
		
		for (i=0; i <= 9; i++ ) {
				
			resultado[i] = numero*vetor[i];
				
		}
		
        for (i=0; i <= 9; i++ ) {
			
			System.out.println(numero + " x " + vetor[i] + " : " + resultado[i] + "\n");	
		}		
	}
}
