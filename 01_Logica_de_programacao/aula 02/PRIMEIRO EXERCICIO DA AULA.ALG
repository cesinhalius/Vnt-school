Algoritmo "Primeiro Codigo"
// Disciplina   : [L�gica de Programa��o]
// Data atual  : 31/01/2023

Var
   // Se��o de Declara��es das vari�veis
    n1,n2:real;
    resultadicao,resultsubtracao:real;
    resultmultiplicacao,resultdivisao:real;

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
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
   Escreval("subtra��o =", resultsubtracao)
   Escreval("multiplica��o =", resultmultiplicacao)
   Escreval("divis�o =", resultdivisao)


Fimalgoritmo