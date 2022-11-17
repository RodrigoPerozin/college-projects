algoritmo "PF5"
// Função : Sua empresa precisa fazer o balanço financeiro anual, portanto faça
//          um algoritmo que peça o ganho bruto e os gastos desta empresa para
//          cada um dos 12 meses de um ano, e que mostre no final o ganho bruto
//          anual, o gasto anual e o saldo financeiro, informando também se a
//          empresa teve lucro ou prejuízo.

// Autor : rodrigo_perozin
// Data : 08/05/2019

var

 contadora: inteiro
 bruto: real
 gasto: real
 gastos1: real
 brutox12: real
 gastos2: real
 gastos3: real
 gastos4: real
inicio

escreva("informe o ganho bruto da empresa: ")
       leia(bruto)
       limpatela

       brutox12 <- bruto * 12
       
       
para contadora de 1 ate 12 passo 1 faca
       escreva("informe o gasto da empresa para o mês ", contadora, ": ")
       leia(gasto)

        escolha(contadora)
        caso 1
        gastos1 <- brutox12 - gasto
        caso 2
        gastos2 <- gastos1 - gasto
        caso 3
        gastos3 <- gastos2 - gasto
        caso 4
        gastos2 <- gastos3 - gasto
        caso 5
        gastos3 <- gastos2 - gasto
        caso 6
        gastos2 <- gastos3 - gasto
        caso 7
        gastos3 <- gastos2 - gasto
        caso 8
        gastos2 <- gastos3 - gasto
        caso 9
        gastos3 <- gastos2 - gasto
        caso 10
        gastos2 <- gastos3 - gasto
        caso 11
        gastos3 <- gastos2 - gasto
        caso 12
        gastos2 <- gastos3 - gasto
       fimescolha
       fimpara
       limpatela
       
       gastos4 <- brutox12 - gastos2
       
       escreval("O ganho bruto anual é: ", brutox12, "$")
       escreval("O gasto anual é: ", gastos4, "$")
       escreval("O seu saldo financeiro é de: ", gastos2, "$")
       
       se(gastos2 < 0)entao
       escreva("A empresa teve Prejuizo.")
       senao
       escreva("A empresa teve Lucro.")
       fimse
       
       


fimalgoritmo
