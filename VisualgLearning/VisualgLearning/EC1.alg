algoritmo "EC1"
// Função :   Lord Nohan, o rei tirano da Vila da Escolha Casual, famoso por ser
//            a pessoa mais rápida da Terra da Lógica a efetuar cálculos de
//            cabeça, o desafiou a um duelo matemático. Por já saber que você
//            havia derrotado o Lord Zohan no [SE5] com uma calculadora, como
//            ele conhece um pouquinho de programação, ele criou um vírus que
//            destrói todos os programas com a palavra “se”. Então crie para
//            essa calculadora um software que o vírus não possa destruir e que
//            faça as quatro operações base da matemática. Para isso, faça com
//            que a calculadora peça o primeiro número, o símbolo do cálculo a
//            ser realizado e o segundo número, e que então ela faça o cálculo e
//            mostre o resultado.

// Autor : rodrigo_perozin
// Data : 22/04/2019

var
   num1 : real
   num2 : real
   sin : inteiro
   mult : real
   divi : real
   sub : real
   adic : real
inicio

     escreva("informe o primeiro número: ")
       leia(num1)
      limpatela
      escreval("soma : 1")
      escreval("subtração : 2")
      escreval("divisão : 3")
      escreval("multiplicação : 4")
      escreva("informe o numero equivalente a sua operação: ")
       leia(sin)
      escreva("informe o segundo número: ")
       leia(num2)
     limpatela
     
     escolha (sin)
             caso 1
              adic <- num1 + num2
               escreva("o resultado da soma é: ", adic)
             caso 2
              sub <- num1 - num2
               escreva("o resultado da subtração é: ", sub)
             caso 3
              divi <- num1 / num2
               escreva("o resultado da divisão é: ", divi)
             caso 4
              mult <- num1 * num2
               escreva("o resultado da multiplicação é: ", mult)
             outrocaso
               escreva("insira um valor valor válido!")
             fimescolha
fimalgoritmo
