Algoritmo "ConsultaPreco"
// Disciplina   : [ L�gica de Programa��o]
// 10) Fa�a um programa que receba as informa��es de produtos:
// O pre�o,A categoria (1 �limpeza; 2 �alimenta��o; ou 3 �vestu�rio),
// A situa��o (R �produtos que necessitam de refrigera��o; e
// N �produtos que n�o necessitam de refrigera��o).

Var
   preco:real
   categoria:inteiro
   situacao:caracter


Inicio

   escreva("Digite o pre�o do produto:")
   leia(preco)
   escreva("Digite a categoria:")
   leia(categoria)
   escreva("Digite a situa��o:")
   leia(situacao)


   se(preco <= 25) entao
      escolha categoria
      caso 1
         escreva(preco)
         preco <- preco + 0.5
         escreval(" Apos o aumento ", preco)
      caso 2
         escreva(preco)
         preco <- preco + 0.8
         escreval(" Apos o aumento ", preco)
      caso 3
         escreva(preco)
         preco <- preco + 0.10
         escreval(" Apos o aumento ", preco)
      fimescolha
   senao
      se(preco > 25) entao
         escolha categoria
         caso 1
            escreva(preco)
            preco <- preco + 0.12
            escreval("Apos o aumento ", preco)
         caso 2
            escreva(preco)
            preco <- preco + 0.15
            escreval("Apos o aumento ", preco)
         caso 3
            escreva(preco)
            preco <- preco + 0.18
            escreval("Apos o aumento ", preco)
         fimescolha
      fimse
   fimse



   //N�o sei o por que do erro com o comando se
   se((categoria = 2) e (situacao = R)) entao
      preco <- preco - 0.5
   senao
      preco <- preco - 0.8
   fimse

   se(preco <= 50.00)entao
      escreval("Barato")
   senao
      se((preco >=50.00) e (preco <=120.00))entao
         escreval("Normal")
      senao
         se(preco>=120.00)
            escreval("Caro")
         fimse
      fimse
   fimse
Fimalgoritmo