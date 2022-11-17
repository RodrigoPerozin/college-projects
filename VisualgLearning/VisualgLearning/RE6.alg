algoritmo "RE6"
// Função : Faça o [RE5] usando REPITA-ATE.

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
   
   repita
   
   escreval("1 - adição")
   escreval("2 - subtração")
   escreval("3 - multiplicação")
   escreval("4 - divisão")
   escreval("Qualquer outra opção fora as disponíveis iram resultar em 0")
   
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
     
     outrocaso
     
     val <- 0
     
     fimescolha
            
            limpatela
            escreval("O resultado é: ", val)
            num1 <- val
            escreval("")
            escreval("1 - sim")
            escreval("2 - nao")
            escreval("Qualquer outra opção fora as disponíveis resultaram no encerramento do programa")
            escreva("Deseja Fazer outra operação? ")
            leia(res)
            limpatela
            

ate(res <> 1)

escreva("TENTE NOVAMENTE MAIS TARDE#")
fimalgoritmo
