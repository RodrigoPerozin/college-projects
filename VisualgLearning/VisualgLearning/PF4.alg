algoritmo "PF4"
// Função : Uma Progressão Aritmética é toda sequência numérica cujos termos a
//          partir do segundo são iguais ao anterior somado com um valor constante
//          denominado razão. (p.ex.:sendo o valor inicial 1, a razão 3 e a
//          quantidade de termos 4, a PA será {1, 4, 7, 10}). Crie um algoritmo
//          de progressão aritmética finita, onde o usuário digite o valor inicial,
//          a razão da progressão e a quantidade de termos da mesma. O algoritmo
//          deve mostrar todos os números dessa PA.

// Autor : rodrigo_perozin
// Data : 08/05/2019
var
     contadora: inteiro
     valini: real
     r: real
     qnums: inteiro
     valfin: real

inicio

escreva("informe o valor inicial da progressão aritmétrica: ")
         leia(valini)
         limpatela
         
escreva("informe agora a razão da progressão aritmétrica: ")
         leia(r)
         limpatela
         
escreva("informe a quantidade de numeros da sequência: ")
         leia(qnums)
         limpatela

escreval(" 1° número da sequencia: ", valini)
para contadora de 2 ate qnums passo 1 faca
valfin <- valini + r
valini <- valfin
escreval(contadora, "° número da sequencia: ", valfin)
fimpara

fimalgoritmo
