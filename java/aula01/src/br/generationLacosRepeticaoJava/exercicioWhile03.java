//Solicitar a idade de várias pessoas e imprimir: Total de pessoas 
//com menos de 21 anos. Total de pessoas com mais de 50 anos.
//O programa termina quando idade for =-99.
package br.generationLacosRepeticaoJava;
import java.util.Scanner;
public class exercicioWhile03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int menorIdade=0, maiorIdade=0; 
		double idade;
		
		do {
	  System.out.println("digite a idade e -99 para mostrar a quantidade de idades: ");
			idade = (int) entrada.nextDouble();
			if(idade<21 && idade>0) {
				menorIdade++;
			}
			else if(idade>50){
				maiorIdade++;
				
			}
			else {
				System.out.println("digite outra idade");
				continue;
			}
			
		}while (idade != -99);
		System.out.println("são "+menorIdade+ " menores que 21 e "+ maiorIdade+ " maiores que 50");

	}

}
