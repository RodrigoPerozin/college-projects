algoritmo "RE2"
// Fun��o :   Fa�a o [RE1] usando REPITA-ATE.

//     (RE1) -     Fa�a um algoritmo usando ENQUANTO-FACA, que pe�a, at� o usu�rio
//                 desejar parar, quantos n�meros o usu�rio quiser, e posteriormente
//                 informe o total de n�meros pedidos, quantos s�o pares e quantos s�o �mpares.

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
       escreva("Voc� deseja continuar inserindo? (1 - sim, outro - n�o) : ")
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
       escreva("Nos n�meros inseridos tem ", par, " n�meros pares e ", imp, " n�meros impares.")


fimalgoritmo
