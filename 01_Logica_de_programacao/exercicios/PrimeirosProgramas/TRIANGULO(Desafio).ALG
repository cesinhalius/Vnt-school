Algoritmo "Tri�ngulo"
// Disciplina   : [ L�gica de Programa��o]

// 10)Escreva um algoritmo que leia tr�s lados quaisquer.
// Identifique se esses lados podem formar um tri�ngulo.
// Caso os lados formem um tri�ngulo,
// identifique se o tri�ngulo � equil�tero, escaleno ou is�celes.

Var

   a,b,c:real
Inicio

   // Escreva um algoritmo que leia tr�s lados quaisquer.
   escreva("Digita o primeiro valor:")
   leia(a)
   escreva("Digita o segundo valor:")
   leia(b)
   escreva("Digite o terceiro valor:")
   leia(c)

   // Identifique se esses lados podem formar um tri�ngulo.

   se((b + c)> a) e ((a + c) > b) e ((a + b)> c) entao
      escreval("� Possivel formar um triangulo")
   senao
      escreval("N�o e possivel formar um triangulo")
   fimse
   //identifique se o tri�ngulo � equil�tero, escaleno ou is�celes.

   se(a=b) e (b=c) e (c=a)entao
      escreval("Tringulo Equil�tero")
   senao
      se(a<>b) e (b<>c) e (c<>a) entao
         escreval("Tringulo Escaleno")
      senao
         se(a=b) ou (b=c) entao
            escreval("Tringulo Is�celes")
         senao
            escreval("N�o � um tringulo")
         fimse
      fimse
   fimse
Fimalgoritmo