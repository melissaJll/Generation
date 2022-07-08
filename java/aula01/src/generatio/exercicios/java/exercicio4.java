//Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.
package generatio.exercicios.java;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		int n, i;
		double p;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		n = leia.nextInt();
		i = n*n;
		p = Math.sqrt(n);
		
		if (n%2 == 0) {
			System.out.println("Seu número é par e a raiz de "+ n +" é "+ p);
		}
		else {
			System.out.println("Seu número é ímpar e " + n + " ao quadrado é "+ i);
		}

		
		
	}
}
