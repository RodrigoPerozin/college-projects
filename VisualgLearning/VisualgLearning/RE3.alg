algoritmo "RE3"
// Função : Desenvolva usando ENQUANTO-FACA um algoritmo semelhante ao [PF4]
//          porém ao invés de solicitar a quantidade de termos, ele deve solicitar
//          o valor máximo aceitável para a PA.

// Autor : rodrigo_perozin
// Data : 22/05/2019

var
val: inteiro
valmax: inteiro
r: inteiro
valor: real
valescr: inteiro

inicio

   escreva("Informe o valor inicial da PA: ")
      leia(val)

   escreva("Informe a razão da PA: ")
      leia(r)

   escreva("Informe o valor máximo aceitavel na PA: ")
      leia(valmax)

   escreval(val)

enquanto (valescr < valmax) faca
   valescr <- val + r
   val <- valescr

   se(valescr > valmax)entao
      escreval("*")
   senao
      escreval(val)
   fimse
fimenquanto

fimalgoritmo

