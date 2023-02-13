Algoritmo "Pares"
// Disciplina   : [ Lógica de Programação]
// Faça um algoritmo que leia 7
// números. Em seguida imprima
// quantos números são pares e
// quais são esses números
// pares. Utilize o conceito de
// vetor.

Var
   numeros:vetor[1..7]de inteiro
   contP,i:inteiro


Inicio
   para i de 1 ate 7 passo 1 faca
      escreva("Digite um valor: ")
      leia(numeros[i])

      se(numeros[i] mod 2 = 0) entao
         contP <- contP + 1
         escreval("valor", numeros[i], " esta na  posição ", i)
      senao
      fimse
   fimpara

   escreva("Total de numeros pares: ", contP)

Fimalgoritmo