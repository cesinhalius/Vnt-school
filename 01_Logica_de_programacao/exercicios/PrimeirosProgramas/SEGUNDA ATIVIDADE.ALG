Algoritmo "Segunda Atividade"
// Disciplina   : [ Lógica de Programação]
// 2) Crie um algoritmo que lê o nome de um aluno, as notas
// de suas três provas.Calcule e exiba a média harmônica
// das provas com o nome do aluno.

Var
   nomeAluno:caracter
   nota1,nota2,nota3,media:real

Inicio

   escreva("Digite seu nome = ")
   leia(nomeAluno)
   escreva("Digite sua primeira nota =")
   leia(nota1)
   escreva("Digite sua segunda nota =")
   leia(nota2)
   escreva("Digite sua terceira nota =")
   leia(nota3)
   
   media <- (nota1 + nota2 + nota3) / 3;
   
   escreva(nomeAluno + " = ")
   escreva(media)
   
   
Fimalgoritmo