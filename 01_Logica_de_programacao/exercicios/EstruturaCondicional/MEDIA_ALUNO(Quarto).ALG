Algoritmo "Media_Aluno"
// Disciplina   : [ L�gica de Programa��o]
// 4)Escreva um Algoritmo que calcule a m�dia de um aluno numa
// dada disciplina e imprima o resultado.

Var
   nota1,nota2,nota3, media: real


Inicio

   escreva("Digite sua primeira nota: ")
   leia(nota1)
   escreva("Digite sua segunda nota:")
   leia(nota2)
   escreva("Digite sua terceira nota:")
   leia(nota3)


   // N�o sei o por que que nao esta aceitando
   se (nota1>=0 e nota1 <=10) entao
      se(nota2 >=0 e nota2 <=10)entao
         se(nota3>=0 e nota3<=10)entao
            se(media >= 7)entao
               escreva("Aprovado")
            senao
               se(media < 7 e media >= 5)entao
                  escreva("Recupera��o")
               senao
                  se(media < 5) entao
                     escreva("Reprovado")
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse
Fimalgoritmo