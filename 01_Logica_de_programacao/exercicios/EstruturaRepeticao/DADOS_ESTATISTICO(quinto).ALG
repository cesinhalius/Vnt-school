Algoritmo "Dados_estatístico"
// Disciplina   : [ Lógica de Programação]

// 5)Escreva um algoritmo que leia informações sobre um grupo
// de 250 pessoas e calcule alguns dados estatísticos.
// Para cada pessoa do grupo deve leia o nome da pessoa, a altura,
// o peso e o sexo (“F” para feminino e “M” para o masculino).
// Calcule e escreva: A quantidade total de homens e mulheres e
// o percentual de cada. A média de peso das pessoas
//(somatório dos pesos de todas as pessoas pela quantidade de pessoas).
// O nome da pessoa mais alta.

Var
   i :inteiro
   nome,sexo,auxNome: caracter
   peso,aux,altura,auxAltura: real
   quantP:inteiro
   quantM,quantF:inteiro
   mediaPeso: real




Inicio

   quantP <- 240

   para i de 1 ate quantP faca
      escreva("Digite o seu nome:")
      leia(nome)
      escreva("Digite o seu peso:")
      leia(peso)
      escreva("Digite o sua altura:")
      leia(altura)
      escreva("Digite o seu sexo:")
      leia(sexo)

      se(sexo = "M")entao
         quantM <- quantM + 1
      senao
         se(sexo="F")entao
            quantF<- quantF + 1
         fimse
      fimse

      aux <- aux + peso

      limpatela

      se(auxAltura > altura) entao
      senao
         auxAltura <- altura
         auxNome <- nome
      fimse
   fimpara

   mediaPeso <- mediapeso + (aux + quantP)

   escreval("Total de pessoas: ", quantP )
   escreval("Total de pessoas Masculinas: ", quantM)
   escreval("Percentual Masculino é",quantM * 100/quantP,"%")
   escreval("Total de pessoas Femininas: ", quantF )
   escreval("Percentual Feminino é",quantF * 100/quantP,"%")
   escreval("Média de peso do grupo: ", mediaPeso)
   escreval("A pessoa mais alta é: ", auxNome)
   
Fimalgoritmo