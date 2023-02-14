Algoritmo "Tabuada"
// Disciplina   : [ Lógica de Programação]
// Escreva um programa que lê um valor inteiro (maior ou igual a 1
// e menor ou igual a 10) e exibe a tabuada (até 10) de
// multiplicação do número lido.

Var
   fator,result,j: inteiro


funcao multiplicacao(F:inteiro) :inteiro
var
   i, n: inteiro
inicio

   se((F>=1) e (F <=10)) entao
      enquanto i <=10 faca
         n <- i*F
         escreval(i," X ", F, " = ",n)
         i <- i+1
      fimenquanto
   fimse

fimfuncao

Inicio
   escreva("Digite o valor do fator: ")
   leia(fator)
   result <- multiplicacao(fator)


Fimalgoritmo