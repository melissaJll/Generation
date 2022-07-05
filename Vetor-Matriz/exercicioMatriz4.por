programa
{/*4 Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
*/
	
	funcao inicio()
	{
		inteiro numeros[3][3], l, c, somaNumeros=0, somaDiagonal=0

		para(l=0; l < 3; l++){
			para(c=0; c < 3; c++){
				escreva("Digite um número: ")
				leia(numeros[l][c])
				somaNumeros += numeros[l][c]

				se(l == c){
					somaDiagonal += numeros[l][c]
				}
				
			}
		}


		escreva("\nA soma é: " + somaNumeros)
		escreva("\nA soma da diagonal principal é: " + somaDiagonal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 16; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */