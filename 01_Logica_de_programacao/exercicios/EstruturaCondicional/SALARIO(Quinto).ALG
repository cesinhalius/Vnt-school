Algoritmo "Salario"
// Disciplina   : [ L�gica de Programa��o]
// 5) Suponha que a empresa "Google" decidiu conceder um aumento
// de sal�rios a seus funcion�rios de acordo com a tabela ao lado.
// Escreva um algoritmo que l�, para cada funcion�rio, o seu nome
// e o seu sal�rio atual. Ap�s receber estes dados,
// o algoritmo calcula o novo sal�rio e escreve na tela as seguintes
// informa��es: <% de aumento><salario atual><salario novo>



// N�o estou entendendo o erro que esta dando na hora de executar
Var
   salarioAtual,Novosalario: real;
   aumento:real
   opcao:inteiro
   nome:caracter

Inicio
   escreva("Digite o seu nome:")
   leia(nome)
   escreva("Digite o seu salario:")
   leia(salarioAtual)

   escolha salarioAtual
   caso 0,1,2,3
      aumento <- 0.20
      Novosalario <- salarioAtual + aumento
   caso 4,5,6
      aumento <- 0.15
      Novosalario <- salarioAtual + aumento
   caso 7,8,9
      aumento <- 0.12
      Novosalario <- salarioAtual + aumento
   caso 10,11,12
      aumento <- 0.10
      Novosalario <- salarioAtual + aumento
   caso 12,13,15
      aumento <- 0.7
      Novosalario <- salarioAtual + aumento
   outrocaso
      aumento <- 0
      Novosalario <- salarioAtual + aumento
   fimescolha
   
   escreva(aumento,"% de aumento", salarioAtual, Novosalario)

Fimalgoritmo