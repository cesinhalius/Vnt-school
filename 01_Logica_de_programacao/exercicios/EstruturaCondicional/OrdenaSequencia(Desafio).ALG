Algoritmo "Ordena_Sequencia"
// Disciplina   : [ Lógica de Programação]
// 9)Faça um programa que lê 4 valores I, A, B e C onde I é um número
// inteiro e positivo e A, B, e C são quaisquer valores reais.
// O programa deve escrever os valores lido

Var
   I : inteiro
   A,B,C : real


Inicio
   escreva("Digite um numero:")
   leia(I)

   escreva("Digite um numero para A:")
   leia(A)
   escreva("Digite um numero para B:")
   leia(B)
   escreva("Digite um numero para C:")
   leia(C)

   se((I >= 0) e (I <= 3)) entao
      escolha I
      caso 1
         se((A > B) e (A > C))entao
            se(B > C)entao
               escreva("SEQUENCIA: ", C,B,A)
            senao
               escreva("SEQUENCIA: ", B,C,A)
            fimse
         senao
            se((B > A) e (B > C))entao
               se(A > C)entao
                  escreva("SEQUENCIA: ", C,A,B)
               senao
                  escreva("SEQUENCIA: ", A,C,B)
               fimse
            senao
               se((C > A) e (C > B))entao
                  se(A > B)entao
                     escreva("SEQUENCIA: ", B,A,C)
                  senao
                     escreva("SEQUENCIA: ", A,B,C)
                  fimse
               fimse
            fimse
         fimse
      caso 2
         se((A < B) e (A < C))entao
            se(B < C)entao
               escreva("SEQUENCIA: ", C,B,A)
            senao
               escreva("SEQUENCIA: ", B,C,A)
            fimse
         senao
            se((B < A) e (B < C))entao
               se(A < C)entao
                  escreva("SEQUENCIA: ", C,A,B)
               senao
                  escreva("SEQUENCIA: ", A,C,B)
               fimse
            senao
               se((C < A) e (C < B))entao
                  se(A < B)entao
                     escreva("SEQUENCIA: ", B,A,C)
                  senao
                     escreva("SEQUENCIA: ", A,B,C)
                  fimse
               fimse
            fimse
         fimse
      fimse
   caso 3
      se((A < B) e (A < C))entao
         escreva("SEQUENCIA: ", B,A,C)

      senao
         se((B < A) e (B < C))entao
            escreva("SEQUENCIA: ", A,B,C)
         senao
            se((C < A) e (C < B))entao
               escreva("SEQUENCIA: ", A,C,B)
            fimse
         fimse
      fimse
   fimse
fimescolha
fimse

Fimalgoritmo