Algoritmo "Media"
// Disciplina   : [ Lógica de Programação]
// Exercício 3)
//Faça um Algoritmo
//para mostrar uma listagem de
//alunos. Leia os dados (o nome e as
//duas notas de prova) de 5 alunos.
//Use o conceito de vetor.

Var
   alunos:vetor[1..5] de caracter
   notas: vetor[1..10]de real

   i,j:inteiro
   media:real


Inicio
   para i de 1 ate 5 faca
      escreva("Digite o seu nome:")
      leia(alunos[i])
      para j de 1 ate 2 faca
         escreva("Digite a sua nota:")
         leia(notas[j])
      fimpara
      media <- notas[j] + notas[j+1] / 2
      escreval("O aluno ", alunos[i]," vai ter media de ", media:4:1)
      
      se(notas[j] > 8.0)entao
      escreva("Nota de ", aluno[i]," mais alta da sala")
   fimpara





Fimalgoritmo