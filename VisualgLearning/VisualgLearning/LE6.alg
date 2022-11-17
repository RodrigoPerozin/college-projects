algoritmo "LE6"
// função : Um aluno está desesperado com a chance da reprovação no ensino médio
//          do CENAI, ele ainda não sabe a média, porém foi inferior a 5,0 e
//          superior a 4,0 (disso ele tem certeza, até jurou pra mãe dele),
//          faça um programa que calcule qual deve ser a nota para ele passar
//          de acordo com a nota que ele teve como média.
//          (Use como equação: NE = (50 - 6 * MF) / 4 ).
//          Obs.: NE = Nota necessária no Exame; MF = Média Final adquirida
//          no período regular.

// Autor : rodrigo_perozin
// Data : 20/03/2019
var
  mediaN, mediaF, notaNE : real
inicio
 escreval("Qual a média necessária para passar de ano na sua escola? ")
 leia(mediaN)
 escreval("Quanto ficou a sua Média Final do ano? ")
 leia(mediaF)
 notaNE <- (50 - 6 * mediaF) / 4
 limpatela
 se mediaF >= mediaN entao
   escreva("Você passou direto!!!")
 senao
   escreva("Para você passar no exame é necessário tirar: ", notaNE)
   fimse
fimalgoritmo
