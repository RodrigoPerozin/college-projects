algoritmo "LE8"
// função : Faça um algoritmo que realize a tarefa inversa do LE5, pedindo um
//          tempo em segundos e mostrando quantas horas, minutos e segundos
//          esse tempo representa.

// Autor : rodrigo_perozin
// Data : 20/03/2019
var
 segundoInserido, segundo, minutos, horas : inteiro
 resum, resdois: real
inicio
 escreva("insira a quantidade em segundos: ")
 leia(segundoInserido)
 resum <- segundoInserido \ 60
 resdois <- segundoInserido \ 60 \60
 limpatela
 escreva("")
 escreva("Tem: ", resdois, "h ", resum, "min ", segundoInserido, "s")
 escreva("")
fimalgoritmo
