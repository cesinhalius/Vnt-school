Algoritmo "Fibonacci"
// Disciplina   : [ L�gica de Programa��o]
// Fa�a um algoritmo para exibir os 10 primeiros elementos de uma
// s�rie de Fibonacci usando fun��o com passagem de par�metros
// por refer�ncia.

Var
   limite,result: inteiro


funcao Fibonacci(l:inteiro) :inteiro
var
   v1, v2, v3,cont :inteiro
inicio
   v1 <- -1
   v2 <- 1
   cont <- 0

   enquanto cont < l faca
      v3 <- v1 + v2
      v1<- v2
      v2 <- v3

      cont <- cont+1
      escreva(v3)
   fimenquanto
fimfuncao
Inicio
   escreval("Digite um limite:")
   leia(limite)
   result <- Fibonacci(limite)

Fimalgoritmo
