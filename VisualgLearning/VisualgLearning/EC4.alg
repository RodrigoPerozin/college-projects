algoritmo "EC4"
// Função :  A prefeitura de Springfield decidiu implantar um sistema de rodízio
//           de veículos, e lhe solicitou um algoritmo em que o usuário informe
//           o último número da placa de seu carro, para que o programa possa
//           informar que dia da semana esse carro não pode ir às ruas, seguindo
//           a tabela abaixo:
// Dia da semana
// Placas que não podem circular
// Segunda-feira
// 0 e 5
// Terça-feira
// 1 e 6
// Quarta-feira
// 2 e 7
// Quinta-feira
// 3 e 8
// Sexta-feira
// 4 e 9

// Autor : rodrigo_perozin
// Data : 22/04/2019

var
     ult : inteiro
inicio

    escreva("informe o ultimo número da placa do seu carro: ")
    leia(ult)
    limpatela
    
    escolha(ult)
    caso 0,5
    escreva("Seu carro não pode ir as ruas na segunda-feira!")
    caso 1,6
    escreva("Seu carro não pode ir as ruas na terça-feira!")
    caso 2,7
    escreva("Seu carro não pode ir as ruas na quarta-feira!")
    caso 3,8
    escreva("Seu carro não pode ir as ruas na quinta-feira!")
    caso 4,9
    escreval("Seu carro não pode ir as ruas na sexta-feira!")
    outrocaso
    escreva("informe um número válido!")
    fimescolha
fimalgoritmo
