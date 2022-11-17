algoritmo "PF2"
// Função : Faça um algoritmo que mostre todos os valores pares entre dois
//          números digitados pelo usuário.

// Autor : rodrigo_perozin
// Data : 06/05/2019
var

 val: inteiro
 contadora: inteiro
 a: real
 n: inteiro

inicio
      para contadora de 1 ate 2 passo 1 faca
      escreva("Informe o ", contadora, "° valor inteiro: ")
      leia(val)
       
      a <- val MOD 2
      se(a = 0)entao
      n <- n + 1
      fimse
      fimpara
      
      escreval("")
      escreva("A quantidade de números pares existentes entre os numeros é: ", n)

fimalgoritmo
