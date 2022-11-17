algoritmo "RE5"
// Função : Crie uma calculadora usando ENQUANTO-FACA que permita o cálculo de uma equação, sem limite de números, da seguinte maneira:
//          Peça o primeiro valor,
//          Peça o cálculo que deseja fazer (entre as 4 operações básicas),
//          Peça um segundo valor,
//          Efetue o cálculo,
//          Peça se o usuário que continuar calculando. Se ele responder que sim, volte para o passo 2 usando o resultado do cálculo do passo 4 como primeiro valor, mas se ele disser que não, mostre o resultado final e encerre o programa.
//          Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2

// Autor : rodrigo_perozin
// Data : 27/05/2019
var

 num1: real
 num2: real
 opcao: inteiro
 val: real
 val2: real
 res: inteiro

inicio

   escreva("Insira o primeiro valor: ")
   leia(num1)
   limpatela
   
   enquanto ((res = 1) ou (res = 0)) faca
   
   escreval("1 - adição")
   escreval("2 - subtração")
   escreval("3 - multiplicação")
   escreval("4 - divisão")
   
   escreva("Informe qual das opções você deseja: ")
   leia(opcao)
   limpatela
   
   escreva("informe o segundo valor: ")
   leia(num2)
   limpatela
   
     escolha (opcao)
     caso 1
     val <- num1 + num2
     caso 2
     val <- num1 - num2
     caso 3
     val <- num1 * num2
     caso 4
     val <- num1 / num2
     
     fimescolha
            
            limpatela
            escreval("O resultado é: ", val)
            num1 <- val
            escreval("")
            escreval("1 - sim")
            escreval("2 - nao")
            escreva("Deseja Fazer outra operação? ")
            leia(res)
            limpatela
            

fimenquanto

escreva("TENTE NOVAMENTE MAIS TARDE#")
fimalgoritmo
