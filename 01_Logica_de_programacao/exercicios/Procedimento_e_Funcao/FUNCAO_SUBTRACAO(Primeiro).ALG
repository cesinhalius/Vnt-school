Algoritmo "Funcao_Subtracao"
// Disciplina   : [ L�gica de Programa��o]
// Exerc�cios 1: Fa�a um algoritmo para subtrair dois valores
// usando procedimentos.Imprima o resultado.

Var
   n,m,sub,result:inteiro

funcao subtracao(i,a:inteiro):inteiro
inicio
   retorne i - a
fimfuncao


Inicio
   escreval("Digite um numero:")
   leia(n)
   escreval("Digite outro numero:")
   leia(m)

   result<- subtracao(n,m)
   escreva("Resultado da subtra��o: ", n , " - ",m," =",result)

Fimalgoritmo