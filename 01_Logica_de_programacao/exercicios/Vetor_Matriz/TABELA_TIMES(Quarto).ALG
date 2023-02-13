Algoritmo "Tabela_Times"
// Disciplina   : [ Lógica de Programação]
//  Faça um algoritmo
//  para gerar uma tabela de jogos de
//  futebol. Leve em consideração
//  que deve existir o jogo de ida e o
//  jogo de volta. Use o conceito de
//  vetor para resolver o exercício.

Var
   times:vetor[1..3] de caracter
   ida: vetor[1..3] de inteiro
   volta :vetor[1..3]de inteiro

   i,j,k :inteiro


Inicio
   para i de 1 ate 3 faca
      escreva("Digite o nome do seu time: ")
      leia(times[i])
      para j de 1 ate 3 faca
         escreva("Digite quantitade de jogos de ida: ")
         leia(ida[j])
         para k  de 1 ate 3 faca
            escreva("Digite quantitade de jogos de volta: ")
            leia(volta[k])
            escreval("O ", times[i]," tem ", ida[j] ," jogos de ida e ", volta[k] ," jogos de volta")
         fimpara
      fimpara
   fimpara


Fimalgoritmo