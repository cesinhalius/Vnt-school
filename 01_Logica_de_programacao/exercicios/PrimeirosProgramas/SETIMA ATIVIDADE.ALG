Algoritmo "Setima Atividade"
// Disciplina   : [ L�gica de Programa��o]
// 7) Crie um algoritmo que calcule a �rea de um trap�zio.
// Imprima o resultado na tela.

Var
  baseMaior,baseMenor:real
  altura, area: real;


Inicio

   escreva("Digite a base maior do trap�zio = ")
   leia(baseMaior)
   escreva("Digite a base menor do trap�zio = ")
   leia(baseMenor)
   escreva("Digite a altura do trap�zio = ")
   leia(altura)
   
   area <- (baseMaior + baseMenor) * altura / 2
   
   escreva("�rea do trap�zio � ", area)


Fimalgoritmo