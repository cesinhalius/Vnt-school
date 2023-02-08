Algoritmo "semnome"
// Disciplina   : [ Lógica de Programação]
// 3)Escreva um algoritmo que leia a nota final de 4 alunos.
// Suponha que Pedro e Maria tirem nota máxima 10, e que João e
// Sofia tirem a nota 9 e 8 respectivamente.
// Faça o programa identificar os alunos com a maior nota e
// imprima o resultado.

Var
   posicao1,posicao2,posicao3,posicao4:inteiro
   nota1,nota2,nota3,nota4:Inteiro  // aqui não sei se é melhor por
   aux:inteiro                                 // real ou deixa com inteiro
   nomepos1, nomepos2, nomepos3, nomepos4:caracter
   nome:caracter
   i:inteiro

Inicio
   para i de 1 ate 4 passo 1 faca
      escolha i
      caso 1
         nome <-"Pedro"
         escreva("Digite a nota de ", nome, ":")
         leia(nota1)
         posicao1<-nota1
         nomepos1<- nome

      caso 2
         nome <-"Maria"
         escreva("Digite a nota ", nome,":")
         leia(nota2)
         se(nota1 >= nota2)entao
            posicao2 <- nota2
            nomepos2 <- nome
            aux <- nota1
         senao
            posicao2 <- posicao1
            nomepos2 <- nomepos1
            posicao1 <- posicao2
            posicao1 <- nota2
            aux <- nota2
            nomepos1 <- nome
         fimse

      caso 3
         nome <-"Miguel"
         escreva("Digite a nota ", nome,":")
         leia(nota3)
         se(posicao2 >= nota3)entao
            posicao3<- nota3
            nomepos3<- nome
         senao
            se(posicao1 < nota3) entao
               posicao3<- posicao2
               nomepos3<- nomepos2
               posicao2<- posicao1
               nomepos2<- nomepos1
               aux <- nota3
               nomepos1<- nome
            senao
               posicao3<-posicao2
               nomepos3<-nomepos2
               posicao2<-nota3
               nomepos3<-nomepos2
               posicao2<-posicao3
               nomepos2<-nome
            fimse
         fimse

      caso 4
         nome <-"Julia"
         escreva("Digite a nota ", nome,":")
         leia(nota4)
         se(posicao3>= nota4)entao
            posicao4:= nota4
            nomepos4:= nome
         senao
            se(posicao1< Int(nota4))entao
               posicao4<-posicao3
               nomepos4<-nomepos3
               posicao3<-posicao2
               nomepos3<-nomepos2
               posicao2<-posicao1
               nomepos2<-nomepos1
               aux <- nota4
               nomepos1<- nome
            senao
               se(posicao2 < nota4)entao
                  posicao4<-posicao3
                  nomepos4<-nomepos3
                  posicao3<-nota4
                  nomepos3<-nome
               fimse
            fimse
         fimse
      fimescolha
   fimpara
   

   escreval("")
   escreval("A ordem das notas são:")
   escreval(nomepos1 , ", com a nota de : ", aux)
   escreval(nomepos2 , ", com a nota de : ", posicao2)
   escreval(nomepos3 , ", com a nota de : ", posicao3)
   escreval(nomepos4 , ", com a nota de : ", posicao4)



   Fimalgoritmo