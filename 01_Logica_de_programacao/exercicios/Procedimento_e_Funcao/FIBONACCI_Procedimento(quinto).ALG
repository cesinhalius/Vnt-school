Algoritmo "Fibonacci"
// Disciplina   : [ Lógica de Programação]
// Exercícios 5) Faça um algoritmo para exibir os 10 primeiros
// elementos de uma série de Fibonacci usando procedimentos
// com passagem de parâmetros por referência.

Var
   limite: inteiro


procedimento Fibonacci(l:inteiro)
var
   v1, v2, v3,cont :inteiro
inicio
   v1 <- -1
   v2 <- 1
   cont <- 0

   enquanto cont< l faca
      v3 <- v1 + v2
      v1<- v2
      v2 <- v3
      escreva(v3)
      cont <- cont+1
   fimenquanto
fimprocedimento
Inicio
   escreval("Digite um limite:")
   leia(limite)
   Fibonacci(limite)

Fimalgoritmo