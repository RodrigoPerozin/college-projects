algoritmo "PF6"
// Função : Faça um algoritmo que peça ao usuário 10 números e mostre posteriormente
//          quantos são pares e a soma deles, bem como quantos são ímpares e a soma deles.

// Autor : rodrigo_perozin
// Data : 08/05/2019

var

contadora: inteiro
num: inteiro
validacao: inteiro
p: inteiro
i: inteiro
qp: inteiro
qi: inteiro

inicio

    para contadora de 1 ate 10 passo 1 faca
    escreva("Informe o ", contadora, "° número inteiro: ")
    leia(num)
    
    validacao <- num MOD 2
    
              se(validacao = 0)entao
              p <- num + p
                qp <- 1 + qp
                
              senao
              se(validacao = 1)entao
              i <- num + i
              qi <- 1 + qi
              
              fimse
              fimse
    fimpara
    
limpatela

escreval("A soma dos números pares é: ", p)
escreval("A quantidade de números pares é: ", qp)
escreval("A soma dos números impares é: ", i)
escreva("A quantidade de números impares é: ", qi)

              
              

fimalgoritmo
