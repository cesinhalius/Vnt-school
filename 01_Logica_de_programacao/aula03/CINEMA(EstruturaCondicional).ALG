Algoritmo "cinema"
// Disciplina   : [ L�gica de Programa��o]
// Fa�a um Algoritmo que pe�a ao usu�rio a quantia em dinheiro que ele
// tem sobrando e sugira, caso ele tenha 30 ou mais reais,
// que v� ao cinema, e se n�o tiver, fique em casa vendo TV.
Var
   dinheiro:real


Inicio
   escreva("Digita a quantidade de dinheiro que tem=")
   leia(dinheiro)

   se(dinheiro >= 30) entao
      escreva("V� ao cinema e divirta-se")
   senao
      escreva("Fique em casa e veja TV!!")
   fimse

Fimalgoritmo