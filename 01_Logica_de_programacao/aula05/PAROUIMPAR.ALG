Algoritmo "ParouImpar"
// Disciplina   : [ Lógica de Programação]
//


Var

   num:inteiro
   res:caracter

procedimento Verificador(n:inteiro)

Inicio
   se(n MOD 2 = 0) entao
      res <- " Numero Par"

   senao
      res <- " Numero Impar"
   fimse
fimprocedimento



Inicio
   escreva("Digite um numero:")
   leia(num)
   verificador(num)
   escreval("Esse numero é :", num,  res)


Fimalgoritmo