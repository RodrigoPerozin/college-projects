algoritmo "RE4"
// Função : Faça o [RE3] usando REPITA-ATE.
// Autor : rodrigo_perozin
// Data : 27/05/2019

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

   escreval("Valor:", val)

repita

valescr <- val + r
val <- valescr
 
se(val <= valmax)entao
escreval("Valor:", val)
fimse

ate (val > valmax)
 

fimalgoritmo
