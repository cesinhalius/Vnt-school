Algoritmo "semnome"
// Disciplina   : [ Lógica de Programação]
// 1) Faça um Algoritmo que calcule o fatorial de um número qualquer.
// O usuário deve digitar o número no qual ele deseja obter o resultado
// do fatorial na tela.
// Repita este processo até que o usuário não tenha mais interesse em
// obter cálculo de fatorial.

Var
   n, Cont, Fat: inteiro




Inicio
   repita
      escreval("Informe um número inteiro")
      leia (n)
   ate (n >= 0)
   Cont <- 1
   Fat <- 1
   repita
      Fat <- Fat * Cont
      Cont <- Cont + 1
   ate(cont > n)
   escreva ("O fatorial de", n)
   escreval(" é igual a", Fat)

Fimalgoritmo