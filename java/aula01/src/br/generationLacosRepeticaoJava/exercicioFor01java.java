//1- Informar todos os números de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5. (FOR)

package br.generationLacosRepeticaoJava;

public class exercicioFor01java {

	public static void main(String[] args) {

		
			for (int i = 1000; i<= 1999; i++) {
        
			if(i%11 == 0) {
			System.out.println(i);
			}
		}

		
	}
}
