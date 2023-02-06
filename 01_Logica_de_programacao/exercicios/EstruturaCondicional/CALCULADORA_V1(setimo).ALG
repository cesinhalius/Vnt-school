Algoritmo "Calculadora_V1"
// Disciplina   : [ Lógica de Programação]
// 7) Crie um algoritmo que simule uma calculadora,
// ou seja, que permite ao usuário escolher a operação matemática
// que ele deseja (soma, subtração, multiplicação e divisão).
// Após a escolha da operação desejada, o resultado deve ser
// impresso na tela.
// O usuário deve ler dois números para fazer uso da calculadora.

Var
   numero1, numero2,result :real;
   opcao:inteiro


Inicio
   escreval("-----------------------")
   escreval("-----Calculadora-------")
   escreval("-----------------------")
   escreval("[1] adição")
   escreval("[2] subtração")
   escreval("[3] multiplicação")
   escreval("[4] divisão")
   escreva("Digite sua opção:")
   leia(opcao)

   escolha opcao
   caso 1
      escreva("Digite um numero:")
      leia(numero1)
      escreva("Digite outro numero:")
      leia(numero2)
      result <- numero1 + numero2
      escreva("Seu Resultado é: ",result)
   caso 2
      escreva("Digite um numero:")
      leia(numero1)
      escreva("Digite outro numero:")
      leia(numero2)
      result <- numero1 - numero2
      escreva("Seu Resultado é: ",result)
   caso 3
      escreva("Digite um numero:")
      leia(numero1)
      escreva("Digite outro numero:")
      leia(numero2)
      result <- numero1 * numero2
      escreva("Seu Resultado é: ",result)
   caso 4
      escreva("Digite um numero:")
      leia(numero1)
      escreva("Digite outro numero:")
      leia(numero2)
      result <- numero1 / numero2
      escreva("Seu Resultado é: ",result)
   fimescolha

Fimalgoritmo