Algoritmo "SomarNumero"
// Disciplina   : [ L�gica de Programa��o]

Var
   quantidadeDeNumero,contador,soma,n:inteiro


Inicio
   escreval("Entre com a quntidade de n�mero: ")
   leia(quantidadeDeNumero)
   contador <- 1
   soma <- 0

   enquanto (contador <= quantidadeDeNumero) faca
      escreval("Digite um valor na tela")
      leia(n)
      soma <- soma + n
      contador <- contador + 1
   fimenquanto

   escreval("Resultado", soma)



Fimalgoritmo