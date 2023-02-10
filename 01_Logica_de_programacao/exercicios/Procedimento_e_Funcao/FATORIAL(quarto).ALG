Algoritmo "semnome"
// Disciplina   : [ Lógica de Programação]
// Exercício 4: Escreva o algoritmo, usando função,
// que calcule o fatorial de um número

Var
   n,rest :inteiro




funcao Fatorial(num:inteiro):inteiro
var
   c,f:inteiro


inicio
   se((num = 0) e (num <= 1))entao
      retorne escreva(1)
   senao
      se(n < 0)entao
      senao
         f<-n
         c<-1
         enquanto c<n faca
            f<- f* (n-c)
            c<- c + 1
         fimenquanto
      fimse
      retorne f
   fimse

fimfuncao

Inicio
   escreva("Digite um numero:")
   leia(n)
   rest <- fatorial(n)
   escreva("Resultado do fatorial: ",rest)



Fimalgoritmo