Algoritmo "Triângulo"
// Disciplina   : [ Lógica de Programação]

// 10)Escreva um algoritmo que leia três lados quaisquer.
// Identifique se esses lados podem formar um triângulo.
// Caso os lados formem um triângulo,
// identifique se o triângulo é equilátero, escaleno ou isóceles.

Var

   a,b,c:real
Inicio

   // Escreva um algoritmo que leia três lados quaisquer.
   escreva("Digita o primeiro valor:")
   leia(a)
   escreva("Digita o segundo valor:")
   leia(b)
   escreva("Digite o terceiro valor:")
   leia(c)

   // Identifique se esses lados podem formar um triângulo.

   se((b + c)> a) e ((a + c) > b) e ((a + b)> c) entao
      escreval("é Possivel formar um triangulo")
   senao
      escreval("Não e possivel formar um triangulo")
   fimse
   //identifique se o triângulo é equilátero, escaleno ou isóceles.

   se(a=b) e (b=c) e (c=a)entao
      escreval("Tringulo Equilátero")
   senao
      se(a<>b) e (b<>c) e (c<>a) entao
         escreval("Tringulo Escaleno")
      senao
         se(a=b) ou (b=c) entao
            escreval("Tringulo Isóceles")
         senao
            escreval("Não é um tringulo")
         fimse
      fimse
   fimse
Fimalgoritmo