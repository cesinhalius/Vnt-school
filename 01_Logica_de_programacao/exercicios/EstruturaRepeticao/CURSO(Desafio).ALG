Algoritmo "Curso"
// Disciplina   : [ L�gica de Programa��o]
// 9)Uma Universidade deseja fazer um levantamento a respeito
// de seu vestibular. Para cada curso � fornecido o seguinte
// conjunto de valores: Um c�digo do curso;N�mero de vagas;
// N�mero de candidatos do sexo masculino;N�mero de candidatos
// do sexo feminino.Fazer um programa que:Calcule e escreva, para
// cada curso, o n�mero de candidatos por vaga e a percentagem de
// candidatos do sexo feminino (escreva tamb�m o c�digo correspondente
// do curso);

Var
   codCurso,Nvagas,candidatosF,candidatosM:inteiro
   QuantCurso:inteiro
   i:inteiro
   auxcurso,auxCodcurso,auxNvaga:caracter


Inicio

   escreval("Quantos cursos tem:")
   leia(QuantCurso)
   para i de 1 ate QuantCurso faca
      escreval("Digite o codigo do curso:")
      leia(codCurso)
      escreval("Digite total vagas:")
      leia(Nvagas)
      escreval("Digite o numero de vagas de cadidatos masculino:")
      leia(candidatosM)
      escreval("Digite o numero de vagas de cadidatos Feminino:")
      leia(candidatosF)


      se((Nvagas <= candidatosM) e (Nvagas <= candidatosF))entao
         auxcurso <- escreval(codCurso, " nao possui vagas suficiente")
      senao

      fimse






   fimpara

   escreval("codigo curso: ", codCurso)
   escreval("Total de vagas: ", Nvagas)
   escreval("Percentual Masculino �",candidatosM * 100/Nvagas,"%")
   escreval("Percentual Feminino �",candidatosF * 100/Nvagas,"%")

Fimalgoritmo