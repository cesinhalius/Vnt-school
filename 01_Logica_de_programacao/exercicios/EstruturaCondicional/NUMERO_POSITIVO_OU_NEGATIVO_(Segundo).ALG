Algoritmo "Numero_Positivo_ou_Negativo"
// Disciplina   : [ Lógica de Programação]

// 2) Escreva um programa que leia um número inteiro.
// Se o número lido for positivo, escreva uma mensagem
// indicando se ele é par ou ímpar.
//Se onúmero for negativo,
//escreva a seguinte mensagem “Este número não é positivo”.

Var
   numero :inteiro




Inicio

   escreva("Digite um numero:")
   leia(numero)

   se(numero >= 0)entao
      se( numero mod 2 = 0)entao
         escreva("Numero é par e positivo")
      senao
         escreva("Numero é Impar e positivo")
      fimse
   senao
     escreva("Este número não é positivo")
   fimse



Fimalgoritmo