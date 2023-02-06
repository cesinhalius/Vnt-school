Algoritmo "Financiamento"
// Disciplina   : [ Lógica de Programação]
// 3) Faça um algoritmo que receba o valor do salário de uma pessoa
//  e o valor de um financiamento pretendido. Caso o financiamento
//  seja menor ou igual a 5 vezes o salário da pessoa,
//  o algoritmo deverá escrever "Financiamento Concedido";
//  senão, ele deverá escrever "Financiamento Negado".
//  Independente de conceder ou não o financiamento,
//  o algoritmo escreverá depois a frase "Obrigado por nos consultar."

Var
   salario, financiamento:real


Inicio
   escreva("Digite o seu sálario:")
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