algoritmo "RE2"
// Função :   Faça o [RE1] usando REPITA-ATE.

//     (RE1) -     Faça um algoritmo usando ENQUANTO-FACA, que peça, até o usuário
//                 desejar parar, quantos números o usuário quiser, e posteriormente
//                 informe o total de números pedidos, quantos são pares e quantos são ímpares.

// Autor : rodrigo_perozin
// Data : 22/05/2019

var

    opcao : caractere
    val : inteiro
    par: inteiro
    imp : inteiro

inicio


       opcao <- "1"
       repita
       escreva("insira um valor inteiro: ")
       leia(val)
       escreva("Você deseja continuar inserindo? (1 - sim, outro - não) : ")
       leia(opcao)

       val <- val MOD 2

       se(val = 0)entao
       par <- par + 1
       senao
       se(val <> 0)entao
       imp <- imp + 1
       fimse
       fimse

       ate (opcao <> "1")

       limpatela
       escreva("Nos números inseridos tem ", par, " números pares e ", imp, " números impares.")


fimalgoritmo
