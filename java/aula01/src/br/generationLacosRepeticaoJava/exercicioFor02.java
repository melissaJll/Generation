//2- Ler 10 números e imprimir quantos são pares 
//e quantos são ímpares. (FOR)
package br.generationLacosRepeticaoJava;
import java.util.Scanner;
public class exercicioFor02 {
	
		public static void main(String[] args) {
		int par = 0, impar = 0;
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("digite um número: ");
			int n = entrada.nextInt();
			if(n % 2 == 0) {
				par++;
			} 
			else {
				impar++;
			}
		}
		
		System.out.println(par + " números pares e " + impar + " numeros ímpar");
		
		
	}

}
	

	