//10-14 infantil
// 15-17 juvenil
// 18-25 adulto
package generatio.exercicios.java;
import java.util.Scanner;
public class exercicio3 {
	
	public static void main(String[] args) {
		int idade;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite sua idade em anos: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <=14) {
			System.out.println("Você se encontra na categoria infantil");
		}
		else if(idade >= 15 && idade <=17) {
			System.out.println("Você se encontra na categoria juvenil");
		}
		else if(18 <= idade && idade<=25) {
			System.out.println("Você se encontra na categoria adulto");
		}
		else {
			System.out.println("Você não se encontra em nenhuma categoria ");
		}
	}
}
