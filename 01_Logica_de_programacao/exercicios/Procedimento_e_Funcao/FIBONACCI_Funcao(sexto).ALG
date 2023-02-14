Algoritmo "Fibonacci"
// Disciplina   : [ Lógica de Programação]
// Faça um algoritmo para exibir os 10 primeiros elementos de uma
// série de Fibonacci usando função com passagem de parâmetros
// por referência.

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
