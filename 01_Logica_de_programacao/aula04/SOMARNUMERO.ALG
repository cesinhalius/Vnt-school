Algoritmo "SomarNumero"
// Disciplina   : [ Lógica de Programação]

Var
   quantidadeDeNumero,contador,soma,n:inteiro


Inicio
   escreval("Entre com a quntidade de número: ")
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