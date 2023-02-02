Algoritmo "Quarta Atividade"
// Disciplina   : [ Lógica de Programação]
// 4)Crie um algoritmo que lê o ano atual e o ano em que uma pessoa
//nasceu. Calcule a idade dessa pessoa e imprima o resultado na tela.

Var
  anoAtual,anoNasceu, anos:inteiro
  


Inicio
   escreva("Digite o ano atual =")
   leia(anoAtual)
   escreva("Digite o ano que você nasceu =")
   leia(anoNasceu)
   
   anos <- anoAtual - anoNasceu
   
   escreva("Você tem ", anos, " Anos")
   

Fimalgoritmo