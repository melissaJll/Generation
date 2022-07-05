programa
{/*2
Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
*/
	
	funcao inicio()
	{
		inteiro x, dado[10], repetiu=0, maior=0
		real media=0.0, somaDado=0

		para (x = 0; x < 10; x++){
			escreva("Qual o valor do dado: ")
			leia(dado[x])

			somaDado = somaDado + dado[x]
		
		se (dado[x] > 6 ou dado[x] <1){
			escreva("Número inválido")
		} 
			
		senao se (dado[x] > maior) {
				maior = dado[x]	
			}
			
		se (dado[x] == maior) {
			repetiu = repetiu + 1
		}
		
		media = somaDado / 10
			
	}
			escreva("\n a média é: " + media)
			escreva("\n o maior é: " + maior)
			escreva("\n o maior valor se repetiu " + repetiu + " vezes.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 13; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */