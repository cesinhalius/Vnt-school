Algoritmo "sequencia"

Var
   numero:vetor[1..20] de inteiro
   i, aux,j:inteiro

Inicio
   para i de 1 ate 20 faca
      escreva("Digite um numero:")
      aleatorio 1,200000
      leia(numero[i])
      aleatorio off
   fimpara
   para i de 2 ate 20 faca
      aux <- numero[i]
      j <- i-1
      enquanto aux < numero[j] faca
         numero[j+1] <- numero[j]
         j <- j - 1
         se(j = 0)entao
            interrompa
         fimse
      fimenquanto
      numero[j+1] <- aux
   fimpara
   escreval("--------------------------")

   para i de 1 ate 20 faca
      escreval(i ,"º" ,numero[i])
   fimpara

Fimalgoritmo