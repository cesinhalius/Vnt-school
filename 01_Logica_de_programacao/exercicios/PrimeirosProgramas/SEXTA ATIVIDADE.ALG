Algoritmo "semnome"
// Disciplina   : [ L�gica de Programa��o]
// 6)Crie um algoritmo que converta a temperatura
// Fahrenheit para graus Celsius. Imprima o resultado na tela.

Var
  tempF, tempC:real


Inicio
  escreva("Digite sua temperatura em Fahrenheit =")
  leia(tempF)
  
  tempC <- (tempF-32) / 1.8

  
  escreva("Sua temperatura em graus Celsius � ", tempC)


Fimalgoritmo