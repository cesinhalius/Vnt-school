Algoritmo "semnome"
// Disciplina   : [ L�gica de Programa��o]
// 2)Fa�a um Algoritmo que leia um dado n�mero e imprima na tela
// se este � um n�mero primo ou n�o.


Var
   numero,result,i:inteiro


Inicio

   escreva("Digite um numero:")
   leia(numero)

   se(numero <= 1) entao
      escreva("Numero nao � primo")
   senao
      para i de 1 ate numero faca
         se (numero mod i =0) entao
            escreva("", i)
            result<-result+1
         fimse
         i <- i+1
      fimpara
   fimse

   escreval()
   se(result =2) entao
      escreval("o numero", numero," e primo!")
   senao
      escreval("o numero", numero," n�o e primo!")
   fimse



Fimalgoritmo