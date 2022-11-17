algoritmo "LE5"
// função : Faça um algoritmo que peça para o usuário inserir uma quantidade
//          em horas, outra em minutos e mais uma em segundos e mostre quantos
//          segundos esse horário contém.
// Autor :
// Data : 20/03/2019
var
 horas, minutos, segundos : inteiro
 horasEmSegundos, minutosEmSegundos : inteiro
 resultado : inteiro
inicio
escreval("insira quantas horas tem: ")
leia(horas)
escreval("insira quantos minutos tem: ")
leia(minutos)
escreval("insira quantos seguntos tem: ")
leia(segundos)
horasEmSegundos <- (horas * 60) * 60
minutosEmSegundos <- minutos * 60
resultado <- segundos + horasEmSegundos + minutosEmSegundos
limpatela
escreval("Esses dados são equivalentes a ", resultado, " segundos!")
fimalgoritmo
