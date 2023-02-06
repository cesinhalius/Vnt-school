Algoritmo "semnome"
// Disciplina   : [ Lógica de Programação]
// 2)Faça um Algoritmo que leia um dado número e imprima na tela
// se este é um número primo ou não.


Var
   numero,result,i:inteiro


Inicio

   escreva("Digite um numero:")
   leia(numero)

   se(numero <= 1) entao
      escreva("Numero nao é primo")
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
      escreval("o numero", numero," não e primo!")
   fimse



Fimalgoritmo