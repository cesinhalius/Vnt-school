Algoritmo "Doa��es"
// Disciplina   : [ L�gica de Programa��o]
// 6) Escreva o algoritmo "Programa Solid�rio".
// O doador deve clicar nas op��es para efetuar a sua doa��o.
// Imprima o resultado na tela com o valor da doa��o e
// uma mensagem de agradecimento.

Var
   opcao:inteiro
   valor:real

Inicio
   escreval("----------------------------")
   escreval("----Programa Solidario----- ")
   escreval("----------------------------")
   escreval("[1] para doar R$10")
   escreval("[2] para doar R$25")
   escreval("[3] para doar R$50")
   escreval("[4] para doar outro valor")
   escreval("[5] para cancelar")
   escreva("Digite um das op��es:")
   leia(opcao)


   escolha opcao
   caso 1
      escreval("Sua doa��o foi de R$10")
      escreval("Muito Obrigado pela ajuda")
   caso 2
      escreval("Sua doa��o foi de R$25")
      escreval("Muito Obrigado pela ajuda")
   caso 3
      escreval("Sua doa��o foi de R$50")
      escreval("Muito Obrigado pela ajuda")
   caso 4
      escreva("Digite o valor para a doa��o:")
      leia(valor)
      escreval("Sua doa��o foi de R$", valor)
      escreval("Muito Obrigado pela ajuda")
   caso 5
      escreva("Doa��o cancelada")
   fimescolha

Fimalgoritmo