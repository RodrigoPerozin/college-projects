algoritmo "PF1"
// Função :  Faça um algoritmo que some quantos números o usuário quiser, sempre
//           pedindo seus valores a ele, e que ao fim mostre o resultado.

// Autor : rodrigo_perozin
// Data : 06/05/2019

var
   quant: inteiro
   contadora: inteiro
   num: real
   soma: real

inicio

      escreva("insira a quantidade de números a serem somados: ")
      leia(quant)
      limpatela
      
     para contadora de 1 ate quant passo 1 faca
     
      escreva("Informe o valor do ", contadora, "° número a ser somado: ")
      leia(num)
      
      soma <- soma + num
      
      fimpara
      
      escreval("")
      escreva("A soma dos números informados é igual a: ", soma)
      escreval("")

fimalgoritmo
