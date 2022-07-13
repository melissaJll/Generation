package br.generationVetorMatriz;

import java.util.Scanner;

public class exercicioMatriz02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] valores = new int[3][3];
		int soma = 0, somaDiagonal = 0;
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				System.out.printf("digite os valores: ");
				valores[l][c] = entrada.nextInt();
				soma = soma + valores[l][c];
				
				if(l==c) {//0,0  1,1  2,2--> diagonal
					somaDiagonal = somaDiagonal + valores[l][c];
				}
				
			}
		}
		
		System.out.println("A soma dos valores é: " + soma);
		System.out.println("a soma da diagonal é: " + somaDiagonal);

		
		
	}

}
