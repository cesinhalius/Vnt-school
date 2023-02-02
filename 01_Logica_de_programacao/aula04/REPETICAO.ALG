Algoritmo "semnome"
// Disciplina   : [ Lógica de Programação]


Var
   numero : inteiro
   i: inteiro
   numero_Negativo: inteiro



Inicio

   i <- 0
   repita
      escreval("Digite um numero:")
      leia(numero)

      se(numero < 0)entao
         numero_Negativo <- numero_Negativo + 1
      fimse
       i <- i + 1
   ate i = 5
   escreval("Quantidade de numeros informados ", i)
   escreval("Quantidadede números negativos ", numero_Negativo)


Fimalgoritmo