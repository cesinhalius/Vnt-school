Algoritmo "Financiamento"
// Disciplina   : [ L�gica de Programa��o]
// 3) Fa�a um algoritmo que receba o valor do sal�rio de uma pessoa
//  e o valor de um financiamento pretendido. Caso o financiamento
//  seja menor ou igual a 5 vezes o sal�rio da pessoa,
//  o algoritmo dever� escrever "Financiamento Concedido";
//  sen�o, ele dever� escrever "Financiamento Negado".
//  Independente de conceder ou n�o o financiamento,
//  o algoritmo escrever� depois a frase "Obrigado por nos consultar."

Var
   salario, financiamento:real


Inicio
   escreva("Digite o seu s�lario:")
   leia(salario)
   escreva("Digite o valor do financiamento:")
   leia(financiamento)
   
   se (financiamento <= (salario * 5))entao
   escreval("Financiamento Concedido")
   escreval("Obrigado por nos consultar")
   senao
   escreval("Financiamento Negado")
   escreval("Obrigado por nos consultar")
   fimse
Fimalgoritmo