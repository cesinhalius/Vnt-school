Algoritmo "IMC"
// Disciplina   : [ L�gica de Programa��o]
// 8) Escreva um algoritmo que calcule o IMC de uma pessoa e
// imprima a situa��o em que ela se encontra.

Var
   massa,altura: real;
   IMC :inteiro


Inicio
   escreva("Digite seu peso:")
   leia(massa)
   escreva("Digite sua altura:")
   leia(altura)

   IMC <- Int(massa/(altura ^ 2))

   escolha IMC
   caso 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16
      escreva("Magreza grave")
   caso 16, 17
      escreva("magreza moderada")
   caso 17,18.5
      escreva("magreza leve")
   caso 18.5,  25
      escreva("Saudavel")
   caso 25,26,27,28,29,30
      escreva("Sobrepeso")
   caso 30,31,32,33,34,35
      escreva("Obsidade Grau I")
   caso 35,36,37,38,39,40
      escreva("Obsidade Grau II(Severa)")
   caso 40
      escreva("Obsidade Grau III (M�rbida)")
   outrocaso
      escreva("Obsidade Grau III (M�rbida)")
   fimescolha
Fimalgoritmo