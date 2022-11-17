algoritmo "LE4"
//função : Um comerciante tem dificuldade em usar a calculadora
//         para fazer contas que envolvam porcentagem, porém ele gostaria de
//         informar aos seus clientes quanto eles pagam de impostos nos produtos
//         comprados ali. Sabendo que os impostos de seus produtos são fixos em
//         30%, desenvolva um programa em que ele insira o valor pago pelo
//         consumidor e que tenha como saída o valor total a ser pago, o valor
//         do imposto e o valor sem o imposto.
// Autor : rodrigo_perozin
// Data : 20/03/2019
var
valorPago, imposto, valorSemImposto : Real
inicio
escreva("Insira o valor pago: ")
leia(ValorPago)
imposto <- 0,3 * ValorPago
ValorSemImposto <- ValorPago - imposto
escreval("Valor Pago: ", ValorPago)
escreval("valor do imposto: ", imposto)
escreva("FIM")
fimalgoritmo
