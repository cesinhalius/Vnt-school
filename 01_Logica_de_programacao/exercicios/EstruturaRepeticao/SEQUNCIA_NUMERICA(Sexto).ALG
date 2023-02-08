Algoritmo "Sequncia_Numerica"
// Disciplina   : [ Lógica de Programação]
//

Var
   inicial,final:inteiro
   i,j:inteiro

Inicio
   escreval("Digite um valor inicial: ")
   leia(inicial)
   escreval("Digite um valor final: ")
   leia(final)

   se(inicial > final)entao
      para i de inicial ate final passo -1 faca

         escreva(i)

      fimpara
   senao
      se(inicial < final) entao
         para j de inicial ate final faca
            escreva(j)
         fimpara

      fimse
   fimse

Fimalgoritmo