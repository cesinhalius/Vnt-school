Algoritmo "Matriz"
// Disciplina   : [ Lógica de Programação]


Var
   valor : vetor [1..3,1..3] de real
   i,j:inteiro
   somaTotal,somadiagonal, somacoluna2,somalinha3:real

Inicio
   para i de 1 ate 3 faca
      para j de 1 ate 3 faca
         escreval("Digite um valor :")
         leia(valor[i,j])
         somaTotal <- valor[i,j] + somatotal
      fimpara
   fimpara

   para j de 1 ate 3 faca
      somalinha3 <- valor[3,j]
      
Fimalgoritmo