package br.generationLacosRepeticaoJava;
import java.util.Scanner;
public class exercicioDoWhile05 {

	public static void main(String[] args) {
		double a, soma = 0.0;
		
		Scanner entrada = new Scanner(System.in); 
		
		do {
	System.out.println("digite um numero para soma e zero para mostrar a soma: ");
			a = entrada.nextDouble();
			soma = soma + a;
			
		}while (a != 0.0);
		System.out.println("Asoma dos numeros é: " + soma);
		
	}

}
