Algoritmo "AreadoCirculo"
// Disciplina   : [ L�gica de Programa��o]
// Fa�a um Algoritmo para calcular a �rea de um c�rculo,
// fornecido o valor do raio, que deve ser positivo.

Var
  raio, area :real


Inicio
    escreva("Digite o valor do raio = ")
    leia(raio)

    area <- pi * raio ^ 2
    
    escreva(area:2:1)

Fimalgoritmo