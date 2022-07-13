package br.generationVetorMatriz;
import java.util.Scanner;
public class exercicioVetor01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[5];
		int maiorNum =0;
		for(int i = 0; i <=4;i++){
			System.out.println("Digite o valor: ");
			vetor [i] = entrada.nextInt();
	
		}
		
		for(int i = 0; i <=4;i++) {
			if (vetor [i] > maiorNum) {
		        maiorNum = vetor[i];
			}
			System.out.println("valor: "+vetor [i]);
		}
		System.out.println("a maior pontuação é: "+maiorNum);
		
		
	}
}
