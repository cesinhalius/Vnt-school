Algoritmo "NumeroPerfito"
// Disciplina   : [ L�gica de Programa��o]

// 4)Escreva um algoritmo que gera e escreve os 4 primeiros n�meros
// perfeitos.Um n�mero perfeito � aquele que � igual � soma dos
// seus divisores.
// Ex: 6 = 1+2+3, 28 = 1+2+4+7+14.

Var
   i,j,somaDiv,n: inteiro

   // N�o sei se � para escrever os 4 numeros

Inicio
   escreva("Digite um valor:")
   leia(n)

   somaDiv <- 0
   para j <- 1 ate n-1 fa�a
      se(n mod j =0) entao
         escreval(j," + ", somaDiv)
         somaDiv := somaDiv + j
      fimse
   fimpara
   se(somaDiv = n)entao
      escreva("Perfeito")
   senao
      escreva("N�o Perfeito")
   fimse








Fimalgoritmo