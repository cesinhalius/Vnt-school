Algoritmo "semnome"
// Disciplina   : [ L�gica de Programa��o]
// 1) Fa�a um Algoritmo que calcule o fatorial de um n�mero qualquer.
// O usu�rio deve digitar o n�mero no qual ele deseja obter o resultado
// do fatorial na tela.
// Repita este processo at� que o usu�rio n�o tenha mais interesse em
// obter c�lculo de fatorial.

Var
   n, Cont, Fat: inteiro




Inicio
   repita
      escreval("Informe um n�mero inteiro")
      leia (n)
   ate (n >= 0)
   Cont <- 1
   Fat <- 1
   repita
      Fat <- Fat * Cont
      Cont <- Cont + 1
   ate(cont > n)
   escreva ("O fatorial de", n)
   escreval(" � igual a", Fat)

Fimalgoritmo