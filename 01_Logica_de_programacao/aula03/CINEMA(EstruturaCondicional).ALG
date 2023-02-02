Algoritmo "cinema"
// Disciplina   : [ Lógica de Programação]
// Faça um Algoritmo que peça ao usuário a quantia em dinheiro que ele
// tem sobrando e sugira, caso ele tenha 30 ou mais reais,
// que vá ao cinema, e se não tiver, fique em casa vendo TV.
Var
   dinheiro:real


Inicio
   escreva("Digita a quantidade de dinheiro que tem=")
   leia(dinheiro)

   se(dinheiro >= 30) entao
      escreva("Vá ao cinema e divirta-se")
   senao
      escreva("Fique em casa e veja TV!!")
   fimse

Fimalgoritmo