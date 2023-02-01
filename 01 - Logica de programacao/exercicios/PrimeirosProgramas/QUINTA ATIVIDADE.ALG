Algoritmo "Quinta Atividade"
// Disciplina   : [ Lógica de Programação]
// 5) Crie um algoritmo que faça a conversão do moeda real para
// a moeda euro. Imprima o resultado na tela.

Var
   euro:real
   moeda_real:real


Inicio

   escreva("Digite seu valor de real =")
   leia(moeda_real)
   euro <- 0.18
   se (moeda_real = 0)entao
   euro <-0
   senao
   euro <- moeda_real * euro;
   fimse
   
   escreva("Seu valor em euros ", euro)


Fimalgoritmo