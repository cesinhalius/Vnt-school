Algoritmo "Jogo_da_Velha"
// Disciplina   : [ Lógica de Programação]
// Desafio desenvolva um jogo da velha

Var
   l, c : inteiro //variaveis de linha e coluna
   a, b, resultx, resulty, i, j, q, t: inteiro
   simNao, o, x, ff : caractere
   jogoMatriz : vetor [1..3, 1..3] de caractere
   checaNum : vetor [1..9] de inteiro

procedimento criaMatriz()
inicio   // Cria a matriz com numeros de 1 a 9
   q <- 4
   t <- 7
   para i de 1 ate 3 faca
      jogoMatriz[1,i] <- numpcarac(i)
      jogoMatriz[2,i] <-  numpcarac(q)
      jogoMatriz[3,i] <- numpcarac(t)
      q <- q + 1
      t <- t + 1
   fimpara
fimprocedimento



procedimento jogar() // Parte jogável
var
   ch, i, j : inteiro
   aux : logico
   diferente: caractere
inicio
   ch <- 0
   diferente <- ""
   i <- 1
   enquanto i < 10 faca
      se (i % 2 <> 0) entao
         x <- "X"
      senao
         x <- "O"
      fimse
      Escreva ("Digite um número Jogador para ", x ," : ")
      leia (a)
      aux <- falso
      para j de 1 ate i faca
         se (a = checaNum[j]) entao
            escreval(a, " já foi digitado! ")
            aux <- verdadeiro
            diferente <- "diferente "
         fimse
      fimpara
      se (aux = falso) entao
         checaNum[i] <- a
         i <- i + 1
         diferente <- ""
         resultx <- linhaX(a)
         resulty <- ColunaY(a)
         jogoMatriz[resultx,resulty] <- x
         limpatela
         velha()
         deuVelhax()
         deuVelhaO()
      fimse
   fimenquanto
fimprocedimento

//--------------------------------------------------------//
procedimento velha() //Layout jogo da Velha
inicio
   Escreval("+---+---+---+")
   Escreval("| ", jogoMatriz[1,1], " | ", jogoMatriz[1,2], " | ", jogoMatriz[1,3], " |")
   Escreval("+---+---+---+")
   Escreval("| ", jogoMatriz[2,1], " | ", jogoMatriz[2,2], " | ", jogoMatriz[2,3], " |")
   Escreval("+---+---+---+")
   Escreval("| ", jogoMatriz[3,1], " | ", jogoMatriz[3,2], " | ", jogoMatriz[3,3], " |")
   Escreval("+---+---+---+")
fimprocedimento
//-----------------------------------------------------------//

funcao linhaX(x : inteiro) : inteiro // insere valor na linha escolhida
inicio
   se (x >= 1) e (x <= 3) entao
      retorne 1
   senao
      se (x >= 4) e (x <= 6) entao
         retorne 2
      senao
         se(x >= 7) e (x <= 9) entao
            retorne 3
         fimse
      fimse
   fimse
fimfuncao
//---------------------------------------------------------------//

//---------------------------------------------------------------//
funcao colunaY(y : inteiro) : inteiro  //insere valor na coluna escolhida
inicio
   se (y = 1) ou (y = 4) ou (y = 7) entao
      retorne 1
   senao
      se (y = 2) ou (y = 5) ou (y = 8) entao
         retorne 2
      senao
         se(y = 3) ou (y = 6) ou (y = 9) entao
            retorne 3
         fimse
      fimse
   fimse
fimfuncao
//----------------------------------------//
procedimento fimdeJogo()//Reinicia ou finaliza o jogo
inicio
   limpaVet() // limpa o vetor de checagem
   escreval ("Fim de jogo!")
   escreval ("O JOGADOR [", x, "] VENCEU!!!")
   escreva ("Deseja jogar novamente? [S/N]")
   leia (simNao)
   se (simNao <> "S") entao
      limpatela
   senao
      limpatela
      criaMatriz()
      velha()
      jogar()
   fimse
fimprocedimento
//----------------------------------------//

procedimento deuVelhaX() //analisa se não deu velha em X

inicio
   se (jogoMatriz[1,1] = "X") e (jogoMatriz[1,2] = "X") e (jogoMatriz[1,3] = "X") entao
      fimdeJogo()
   senao
      se (jogoMatriz[2,1] = "X") e (jogoMatriz[2,2] = "X") e (jogoMatriz[2,3] = "X") entao
         fimdeJogo()
      senao
         se (jogoMatriz[3,1] = "X") e (jogoMatriz[3,2] = "X") e (jogoMatriz[3,3] = "X") entao
            fimdeJogo()
         senao
            se (jogoMatriz[1,1] = "X") e (jogoMatriz[2,1] = "X") e (jogoMatriz[3,1] = "X") entao
               fimdeJogo()
            senao
               se (jogoMatriz[1,2] = "X") e (jogoMatriz[2,2] = "X") e (jogoMatriz[3,2] = "X") entao
                  fimdeJogo()
               senao
                  se (jogoMatriz[1,3] = "X") e (jogoMatriz[2,3] = "X") e (jogoMatriz[3,3] = "X") entao
                     fimdeJogo()
                  senao
                     se (jogoMatriz[1,1] = "X") e (jogoMatriz[2,2] = "X") e (jogoMatriz[3,3] = "X") entao
                        fimdeJogo()
                     senao
                        se (jogoMatriz[1,3] = "X") e (jogoMatriz[2,2] = "X") e (jogoMatriz[3,1] = "X") entao
                           fimdeJogo()
                        fimse
                     fimse
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse
fimprocedimento
//-----------------------------------------//

//-----------------------------------------//
procedimento deuVelhaO() //analisa se não de velha em O
inicio
   se (jogoMatriz[1,1] = "O") e (jogoMatriz[1,2] = "O") e (jogoMatriz[1,3] = "O") entao
      fimdeJogo()
   senao
      se (jogoMatriz[2,1] = "O") e (jogoMatriz[2,2] = "O") e (jogoMatriz[2,3] = "O") entao
         fimdeJogo()
      senao
         se (jogoMatriz[3,1] = "O") e (jogoMatriz[3,2] = "O") e (jogoMatriz[3,3] = "O") entao
            fimdeJogo()
         senao
            se (jogoMatriz[1,1] = "O") e (jogoMatriz[2,1] = "O") e (jogoMatriz[3,1] = "O") entao
               fimdeJogo()
            senao
               se (jogoMatriz[1,2] = "O") e (jogoMatriz[2,2] = "O") e (jogoMatriz[3,2] = "O") entao
                  fimdeJogo()
               senao
                  se (jogoMatriz[1,3] = "O") e (jogoMatriz[2,3] = "O") e (jogoMatriz[3,3] = "O") entao
                     fimdeJogo()
                  senao
                     se (jogoMatriz[1,1] = "O") e (jogoMatriz[2,2] = "O") e (jogoMatriz[3,3] = "O") entao
                        fimdeJogo()
                     senao
                        se (jogoMatriz[1,3] = "O") e (jogoMatriz[2,2] = "O") e (jogoMatriz[3,1] = "O") entao
                           fimdeJogo()
                        fimse
                     fimse
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse
fimprocedimento
//-----------------------------------------//

//-----------------------------------------//
procedimento limpaVet()
var
   i : inteiro
inicio
   para i de 1 ate 9 faca
      checaNum[i] <- 0
   fimpara
fimprocedimento
//----------------------------------------//
Inicio
   criaMatriz() // Cria a matriz numerada
   velha() // apresenta a matriz
   jogar() // procedimento jogável
   Escreval()
   Escreval()
Fimalgoritmo


Fimalgoritmo