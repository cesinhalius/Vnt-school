Algoritmo "Salario"
// Disciplina   : [ Lógica de Programação]
// 5) Suponha que a empresa "Google" decidiu conceder um aumento
// de salários a seus funcionários de acordo com a tabela ao lado.
// Escreva um algoritmo que lê, para cada funcionário, o seu nome
// e o seu salário atual. Após receber estes dados,
// o algoritmo calcula o novo salário e escreve na tela as seguintes
// informações: <% de aumento><salario atual><salario novo>



// Não estou entendendo o erro que esta dando na hora de executar
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