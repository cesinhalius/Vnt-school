Algoritmo "Calculadora_V1"
// Disciplina   : [ L�gica de Programa��o]
// 7) Crie um algoritmo que simule uma calculadora,
// ou seja, que permite ao usu�rio escolher a opera��o matem�tica
// que ele deseja (soma, subtra��o, multiplica��o e divis�o).
// Ap�s a escolha da opera��o desejada, o resultado deve ser
// impresso na tela.
// O usu�rio deve ler dois n�meros para fazer uso da calculadora.

Var
   numero1, numero2,result :real;
   opcao:inteiro


Inicio
   escreval("-----------------------")
   escreval("-----Calculadora-------")
   escreval("-----------------------")
   escreval("[1] adi��o")
   escreval("[2] subtra��o")
   escreval("[3] multiplica��o")
   escreval("[4] divis�o")
   escreva("Digite sua op��o:")
   leia(opcao)

   escolha opcao
   caso 1
      escreva("Digite um numero:")
      leia(numero1)
      escreva("Digite outro numero:")
      leia(numero2)
      result <- numero1 + numero2
      escreva("Seu Resultado �: ",result)
   caso 2
      escreva("Digite um numero:")
      leia(numero1)
      escreva("Digite outro numero:")
      leia(numero2)
      result <- numero1 - numero2
      escreva("Seu Resultado �: ",result)
   caso 3
      escreva("Digite um numero:")
      leia(numero1)
      escreva("Digite outro numero:")
      leia(numero2)
      result <- numero1 * numero2
      escreva("Seu Resultado �: ",result)
   caso 4
      escreva("Digite um numero:")
      leia(numero1)
      escreva("Digite outro numero:")
      leia(numero2)
      result <- numero1 / numero2
      escreva("Seu Resultado �: ",result)
   fimescolha

Fimalgoritmo