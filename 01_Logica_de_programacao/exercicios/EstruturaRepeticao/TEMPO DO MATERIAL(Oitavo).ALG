Algoritmo "tempo do material"
// Disciplina   : [ Lógica de Programação]

// 8) Um determinado material radioativo perde metade de sua
// massa a cada 50 segundos. Dada a massa inicial, em gramas,
// fazer um programa que determine o tempo necessário para que essa
// massa se torne menor que 0,5 grama. Escreva a massa inicial,
// a massa final e o tempo calculado em horas e minutos.

Var
   massaI,massaF, auxI: real
   hora,minutos,segundo:inteiro
   i:inteiro

Inicio

   escreval("Digite quantas gramas tem seu material:")
   leia(massaI)
   auxI <- massaI
   segundo <- 0
   repita
      enquanto hora <= 24 faca
         se(segundo = 50) entao
            massaF <- massaI - (massaI/2)
         fimse

         se(segundo = 60)entao
            segundo <- 0
            minuto  <- minuto + 1
         senao
            se(minuto = 60)entao
               minuto <- 0
               hora <- hora + 1
            fimse
            segundo <- segundo + 1
         fimse
      fimenquanto
   ate(massaF < 0.5)

   escreval("Massa Inicial: ", auxI)
   escreval("Massa Final : ", massaF)
   escreval("Tempo: ", hora, ":", minuto, ":" , segundo)




Fimalgoritmo