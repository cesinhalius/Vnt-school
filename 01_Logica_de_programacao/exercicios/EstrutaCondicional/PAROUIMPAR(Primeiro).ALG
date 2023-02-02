Algoritmo "ParouImpar"
// Disciplina   : [ Lógica de Programação]
// 1) Crie um algoritmo que lê um dado número e decida
// se ele é par ou ímpar.Imprima o resultado.

Var
   numero : inteiro


Inicio
   escreva("Digite um número :")
   leia(numero)

   se(numero mod 2 = 0) entao
      escreva("O seu numero é Par")
   senao
      escreva("O seu numero é Impar")
   fimse


Fimalgoritmo