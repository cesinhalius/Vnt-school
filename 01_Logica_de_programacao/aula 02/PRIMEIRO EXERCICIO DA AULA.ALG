Algoritmo "Primeiro Codigo"
// Disciplina   : [Lógica de Programação]
// Data atual  : 31/01/2023

Var
   // Seção de Declarações das variáveis
    n1,n2:real;
    resultadicao,resultsubtracao:real;
    resultmultiplicacao,resultdivisao:real;

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Escreval("Digite um numero:")
   leia(n1)
   Escreval("Digite outro numero:")
   leia(n2)
   
   resultadicao <- n1 + n2
   resultsubtracao <- n1 - n2
   resultmultiplicacao <- n1 * n2
   resultdivisao <- n1 / n2
   
   Escreval("primeiro numero =", n1)
   Escreval("segundo numero =", n2)
   Escreval("soma =", resultadicao)
   Escreval("subtração =", resultsubtracao)
   Escreval("multiplicação =", resultmultiplicacao)
   Escreval("divisão =", resultdivisao)


Fimalgoritmo