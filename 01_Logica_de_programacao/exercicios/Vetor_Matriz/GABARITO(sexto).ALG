Algoritmo "Gabarito"

// Exercícios 6: Faça um algoritmo para corrigir uma prova,
// a partir de um gabarito. Primeiro leia o gabarito, ou seja,
// leia a resposta de 5 questões. Em seguida leia o nome de 3 alunos
// e leia as respectivas respostas das 5 questões marcada por eles.
// Confira o resultado e imprima na tela, ou seja, a nota alcançada
// por cada aluno. Imprima também a média da turma.

Var
   G_Aluno:vetor[1..3,1..6]:caracter
   G_Resposta:vetor[1..5]:caracter
   V_Media:vetor[1..3]: real

   i,j,x,y,nota:inteiro
Inicio


   para x de 1 ate 5 faca
      escreva("Digite a resposta da questao", i,"°")
      leia(G_Resposta[x])
   fimpara


   para i de 1 ate 3 faca
      para j de 1 ate 6 faca
         para y de 1 ate 5 faca
            para z de 1 ate 3 faca
               se(j=1)entao
                  escreva("Digite o nome do aluno:")
                  leia(G_Aluno[i,1])
               fimse
               se(j=2) entao
                  escreval("Digite a primeira nota do aluno:")
                  leia(Numpcarac(G_Aluno[i,2]))
                  se(G_Resposta[y] = G_Aluno[i,2])entao
                     nota <- nota + 1
                  fimse
                  media <- media + nota
               fimse
               se(j=3) entao
                  escreval("Digite a segunda nota do aluno:")
                  leia(Numpcarac(G_Aluno[i,3]))
                  se(G_Resposta[y] = G_Aluno[i,3])entao
                     nota <- nota + 1
                  fimse
               fimse
               media <- media + nota
               se(j=4) entao
                  escreval("Digite a terceira nota do aluno:")
                  leia(Numpcarac(G_Aluno[i,4]))
                  se(G_Resposta[y] = G_Aluno[i,4])entao
                     nota <- nota + 1
                  fimse
               fimse
               se(j=5) entao
                  escreval("Digite a quarta nota do aluno:")
                  leia(Numpcarac(G_Aluno[i,5]))
                  se(G_Resposta[y] = G_Aluno[i,5])entao
                     nota <- nota + 1
                  fimse
               fimse
               se(j=6) entao
                  escreval("Digite a quinta nota do aluno:")
                  leia(Numpcarac(G_Aluno[i,6]))
                  se(G_Resposta[y] = G_Aluno[i,6])entao
                     nota <- nota + 1
                  fimse
                  escreva(nota)
                  V_Media[z] <- nota / 5
                  escreva(V_Media[z])
                  nota <- 0
               fimse
            fimpara
         fimpara
      fimpara
   fimpara
Fimalgoritmo