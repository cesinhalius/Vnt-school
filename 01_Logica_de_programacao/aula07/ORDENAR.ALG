Algoritmo "ORDENAR"
// Disciplina   : [ L�gica de Programa��o]

Var

   num,cont,maior,menor : inteiro


Inicio
   enquanto cont <= 5 faca
      escreval("digite cinco numeros")
      leia(num)
      se(cont=1)entao
         maior<-num
         menor<-num
      fimse

      se (num> maior) entao
         maior <- num
      fimse

      se (num<menor)entao
         menor<-num
      fimse

      cont<-cont + 1
   fimenquanto


Fimalgoritmo