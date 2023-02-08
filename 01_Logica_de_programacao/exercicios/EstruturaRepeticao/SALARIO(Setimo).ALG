Algoritmo "Salario"
// Disciplina   : [ Lógica de Programação]
//

Var
   salarioA,salarioI:real
   percentual:real
   ano:inteiro
   i:inteiro



Inicio

   escreval("Digite um salario:")
   leia(salarioI)

   ano <- 2016
   percentual <- 0.015
   salarioA <- salarioI

   repita
      se(ano = 2017)entao
         salarioA <- salarioA + percentual
      fimse
      se(ano >= 2018) entao
         salarioA <- salarioA + (percentual * 2)
      fimse
      escreval("Salarios :", "R$",salarioA, " No ano de ",ano)
      ano <- ano + 1
   ate(ano = 2023)

Fimalgoritmo