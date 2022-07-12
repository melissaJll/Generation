package br.generationLacosRepeticaoJava;
import java.util.Scanner;
public class exercicioDoWhile06 {

	public static void main(String[] args) {
		double a, quantMultiplos=0,somaMultiplos = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
	System.out.println("digite um numero para continuar acrescentando e zero para mostrar a média: ");
			a = entrada.nextDouble();
			if(a%3 == 0) {
				somaMultiplos = a + somaMultiplos;
				quantMultiplos++;
			}
			
		}while (a != 0.0);
		
		quantMultiplos = quantMultiplos - 1;
		
		System.out.println("A média dos numeros é: " + somaMultiplos/quantMultiplos );
		System.out.println( somaMultiplos);
		System.out.println(quantMultiplos);
	}

}
