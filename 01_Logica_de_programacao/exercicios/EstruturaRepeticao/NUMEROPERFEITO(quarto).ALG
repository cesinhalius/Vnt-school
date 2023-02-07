Algoritmo "NumeroPerfito"
// Disciplina   : [ Lógica de Programação]

// 4)Escreva um algoritmo que gera e escreve os 4 primeiros números
// perfeitos.Um número perfeito é aquele que é igual à soma dos
// seus divisores.
// Ex: 6 = 1+2+3, 28 = 1+2+4+7+14.

Var
   i,j,somaDiv,n: inteiro


Inicio
   escreva("Digite um valor:")
   leia(n)

   somaDiv <- 0
   para j <- 1 ate n-1 faça
      se(n mod j =0) entao
         somaDiv := somaDiv + j
      fimse
   fimpara
   se(somaDiv =n)entao
      escreva("Perfeito")
   senao
      escreva("Não Perfeito")
   fimse








Fimalgoritmo