Algoritmo "Matriz_Par"
// Disciplina   : [ L�gica de Programa��o]
// Exerc�cios 8: Fa�a um Algoritmo para preencher uma matriz de
// terceira ordem e mostrar quais s� as posi��es que possuem
// valores pares.


Var
   numeros:vetor[1..3,1..3]de inteiro
   i,j:inteiro


Inicio

   para i de 1 ate 3 faca
      para j de 1 ate 3 faca
         escreva("Digite um valor:")
         leia(numeros[i,j])
         se(numeros[i,j] mod 2 =0)entao
          escreval("O numero ", numeros[i,j], " esta na posi��o ", "[",i , "," ,j,"]" )
         fimse
         fimpara
      fimpara

Fimalgoritmo