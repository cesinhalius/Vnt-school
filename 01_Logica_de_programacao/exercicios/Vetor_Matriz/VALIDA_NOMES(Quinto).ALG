Algoritmo "Valida_Nomes"
// Disciplina   : [ Lógica de Programação]
//  Exercício 5)
//Faça um algoritmo que leia o nome
//de 10 pessoas e depois
//mostre uma listagem com
//nomes que comecem com
//a letra C.

Var
   Nomes:vetor[1..10] de caracter
   NomescomC:vetor[1..10] de caracter

   i,j:inteiro


Inicio
   para i de 1 ate 10 faca
      escreva("Digite um nome:")
      leia(Nomes[i])

      se(Pos(Nomes[i])= "C")entao
         para j de 1 ate 10 faca
            NomescomC[j] <- Nomes[i]
            escreva(NomescomC[j])
         fimpara
      fimse
   fimpara

Fimalgoritmo