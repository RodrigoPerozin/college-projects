algoritmo "EC5"
// Função : Faça um algoritmo que peça ao usuário um valor, e informe se esse
//          número é par ou ímpar APENAS se ele for entre 1 e 100. Caso o valor
//          não esteja nesta faixa, o usuário deve ser notificado.

// Autor : rodrigo_perozin
// Data : 22/04/2019

var
    val : inteiro
    con : real
    con2 : inteiro
inicio

     escreval("informe um valor inteiro entre 1 e 100: ")
     leia(val)
     limpatela
     
     con2 <- val MOD 2
     
         se(val > 1) E (val < 100)entao
             escolha(con2)
             caso 0
             escreva("é par.")
             outrocaso
             escreva("é impar.")
             fimescolha
             senao
             escreva("o valor inserido não esta na faixa correta!")
             fimse
fimalgoritmo

