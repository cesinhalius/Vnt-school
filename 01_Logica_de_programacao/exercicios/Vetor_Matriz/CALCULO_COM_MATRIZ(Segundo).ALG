Algoritmo "Calculo_com_Matriz"
// Disciplina   : [ Lógica de Programação]
// Exercício 2:
// Faça um algoritmo que leia uma matriz(3,3) e
// calcula as somas:
// a) da linha 3;
// b) da coluna 2;
// c) da diagonal principal;
// e) de todos os elementos da matriz.

Var
   tabela: vetor[1..3,1..3] de real
   i,j,somaLinha3,somaColuna2, somaDig, Total:inteiro


Inicio
   para i de 1 ate 3 faca
      para j de 1 ate 3 faca
         escreval("Digite um valor para a tabela: ")
         leia(tabela[i,j])

         se(i = 3)entao
            somaLinha3 <- Int(somaLinha3 + tabela[3,j])
         fimse

         se(j = 2) entao
            somaColuna2 <- Int(somaColuna2 + tabela[i,2])
         fimse

         se(i = j) entao
         somaDig <- Int(somaDig + tabela[i,j])
         fimse

         Total <- Int(Total + tabela[i,j])
      fimpara
   fimpara

   escreval("O resultado da soma da linha 3 é: ", somaLinha3)
   escreval("O resultado da soma da coluna 2 é: ", somaColuna2)
   escreval("O resultado da soma da Diagonal é: ", somaDig)
   escreval("O resultado da soma da todos os numeros é: ", Total)
   
Fimalgoritmo