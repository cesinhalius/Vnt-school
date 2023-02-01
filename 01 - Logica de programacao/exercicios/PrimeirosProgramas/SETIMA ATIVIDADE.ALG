Algoritmo "Setima Atividade"
// Disciplina   : [ Lógica de Programação]
// 7) Crie um algoritmo que calcule a área de um trapézio.
// Imprima o resultado na tela.

Var
  baseMaior,baseMenor:real
  altura, area: real;


Inicio

   escreva("Digite a base maior do trapézio = ")
   leia(baseMaior)
   escreva("Digite a base menor do trapézio = ")
   leia(baseMenor)
   escreva("Digite a altura do trapézio = ")
   leia(altura)
   
   area <- (baseMaior + baseMenor) * altura / 2
   
   escreva("Área do trapézio é ", area)


Fimalgoritmo