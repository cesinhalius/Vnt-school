Algoritmo "Quarta Atividade"
// Disciplina   : [ L�gica de Programa��o]
// 4)Crie um algoritmo que l� o ano atual e o ano em que uma pessoa
//nasceu. Calcule a idade dessa pessoa e imprima o resultado na tela.

Var
  anoAtual,anoNasceu, anos:inteiro
  


Inicio
   escreva("Digite o ano atual =")
   leia(anoAtual)
   escreva("Digite o ano que voc� nasceu =")
   leia(anoNasceu)
   
   anos <- anoAtual - anoNasceu
   
   escreva("Voc� tem ", anos, " Anos")
   

Fimalgoritmo