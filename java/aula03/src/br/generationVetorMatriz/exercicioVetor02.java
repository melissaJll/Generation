package br.generationVetorMatriz;

import java.util.Scanner;

public class exercicioVetor02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[10];
		int somaDado=0, maior = 0, repeticao = 0;
		double media =0;
		
		
		for(int i = 0; i <=9;i++){
			System.out.println("Digite o valor do dado de um dado de 6 lados: ");
			vetor [i] = entrada.nextInt();
			somaDado = somaDado + vetor[i];
		
			if(vetor [i] > 6 || vetor[i]<0)  {
			System.out.println("Valor invalido digite outro valor do dado");
			}
			else if(vetor [1] > maior) {
				maior = vetor[i];
			}
			if(maior == vetor[i]) {
				repeticao++;
			}

			
	    }
		media = somaDado/10;
		System.out.println("a média é: " + media);
		System.out.println("o maior numero se repetiu " + (repeticao+1));

	}

}

