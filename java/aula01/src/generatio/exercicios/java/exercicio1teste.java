package generatio.exercicios.java;
import java.util.Scanner;
public class exercicio1teste {
	
	public static void main(String[] args) {
    int n1, n2, n3;
		
    	Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextInt();
		
			if(n1>n2 && n1 >n3) {
				System.out.println(n1);
			}
			else if(n2> n1 && n2>n3) {
				System.out.println(n2);
			}
			else{
					System.out.println(n3);
				}
				
		
		
	}
	
}
