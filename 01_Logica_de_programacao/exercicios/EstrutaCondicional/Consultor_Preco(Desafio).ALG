Algoritmo "ConsultaPreco"
// Disciplina   : [ Lógica de Programação]
// 10) Faça um programa que receba as informações de produtos:
// O preço,A categoria (1 –limpeza; 2 –alimentação; ou 3 –vestuário),
// A situação (R –produtos que necessitam de refrigeração; e
// N –produtos que não necessitam de refrigeração).

Var
   preco:real
   categoria:inteiro
   situacao:caracter


Inicio

   escreva("Digite o preço do produto:")
   leia(preco)
   escreva("Digite a categoria:")
   leia(categoria)
   escreva("Digite a situação:")
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



   //Não sei o por que do erro com o comando se
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