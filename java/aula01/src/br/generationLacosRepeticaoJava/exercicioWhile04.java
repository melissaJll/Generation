/* o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/
package br.generationLacosRepeticaoJava;
import java.util.Scanner;
public class exercicioWhile04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i = 1, pessoaCalma= 0, femNervosa = 0, 
		mascAgressivo = 0, outrosCalmos = 0, quarentNervosa = 0,
		jovemCalmo = 0;
		
		int sexo, idade, temperamento;
	
		while( i <= 15) {
			System.out.println("digite sua idade: ");
			idade = entrada.nextInt();
			
			System.out.println("digite o seu sexo sendo 1 - feminino | 2 - masculino | 3 - outros ");
			sexo = entrada.nextInt();
			
			System.out.println("Qual seu temperamento sendo 1 - calma | 2 - nervosa | 3 - agressiva)");
			temperamento = entrada.nextInt();
			
	
			if(temperamento == 1) {
				pessoaCalma++;
			} 
			else if (sexo == 1 && temperamento == 2) {
				femNervosa++;
			} 
			else if (sexo == 2 && temperamento ==3) {
				mascAgressivo++;
			} 
			else if(sexo == 3 && temperamento == 1) {
				outrosCalmos++;
			} 
			else if (idade >= 40 && temperamento == 2) {
				quarentNervosa++;
			} 
			else if (idade <= 18 && temperamento == 1) {
				jovemCalmo++;
			}
			
			i++;	//150
		}
		System.out.println("as pessoas calmas são: " + pessoaCalma);
		System.out.println("o número de mulheres nervosas é : " + femNervosa);
		System.out.println("o número de homens agressivosé: " + mascAgressivo);
		System.out.println("o número de outros calmos é: " + outrosCalmos);
		System.out.println("o número de pessoas nervosas com mais de 40 anos é: " + quarentNervosa);
		System.out.println("o número de pessoas calmas com menos de 18 anos é: " + jovemCalmo);
		

	}

}