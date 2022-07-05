programa
{/*1
Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
*/
	
	funcao inicio()
	{
		inteiro num[5], maiorNum= 0

		para(inteiro x = 0; x <= 4; x++){
			escreva(x+1 + "º número: ")
			leia (num[x])}
				para(inteiro x = 0; x <= 4; x++){
					se (num[x] > maiorNum){
						maiorNum = num[x]
					}

				}


		
		escreva( maiorNum, " é a maior pontuação3")








		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 15; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */