Algoritmo "Numero_Positivo_ou_Negativo"
// Disciplina   : [ L�gica de Programa��o]

// 2) Escreva um programa que leia um n�mero inteiro.
// Se o n�mero lido for positivo, escreva uma mensagem
// indicando se ele � par ou �mpar.
//Se on�mero for negativo,
//escreva a seguinte mensagem �Este n�mero n�o � positivo�.

Var
   numero :inteiro




Inicio

   escreva("Digite um numero:")
   leia(numero)

   se(numero >= 0)entao
      se( numero mod 2 = 0)entao
         escreva("Numero � par e positivo")
      senao
         escreva("Numero � Impar e positivo")
      fimse
   senao
     escreva("Este n�mero n�o � positivo")
   fimse



Fimalgoritmo