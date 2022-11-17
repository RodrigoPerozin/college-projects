algoritmo "LE3"
// função: Faça um programa para ler os valores dos coeficientes
//         A, B e C de uma equação de segundo grau, calcular e imprimir o
// valor de delta, sendo:=b²-4ac
// Autor :  rodrigo_perozin
// Data : 20/03/2019
var
result, Avalor, Bvalor, Cvalor : inteiro
inicio
escreva("insira o valor de A : ")
leia(Avalor)
limpatela
escreva("insira o valor de B : ")
leia(Bvalor)
limpatela
escreva("insira o valor de C : ")
leia(Cvalor)
limpatela
result <- Bvalor * Bvalor - 4 * Avalor * Cvalor
escreva("O resultado da conta do Delta é: ", result)
fimalgoritmo
