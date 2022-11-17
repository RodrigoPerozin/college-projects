algoritmo "EC3"
// Função :  Crie um algoritmo que solicite ao usuário que informe um continente.
//           O programa deve informar quais países desse continente participaram
//           da Copa do Mundo FIFA 2018.

// Autor : rodrigo_perozin
// Data : 22/04/2019

var
  cont : inteiro
inicio

   escreval("!!!COPA DO MUNDO FIFA 2018!!!")
   escreval("continente americano: 1")
   escreval("continente europeu: 2")
   escreval("continente asiático: 3")
   escreval("continente africano: 4")
   escreva("informe o número do continente escolhido: ")
   leia(cont)
   limpatela
   
   escolha(cont)
                caso 1
                escreval("Os países que participaram são o: Brasil, Uruguai, Colômbia, ")
                escreva("Argentina, Costa Rica, México, Panamá.")
                escreval("")
                caso 2
                escreval("Os países que participaram são o: Alemanha, Bélgica, Espanha, ")
                escreva("Inglaterra, Islândia, Polônia, Rússia, França, Portugal, Sérvia.")
                escreval("")
                caso 3
                escreval("Os países que participaram são o: Arábia Saldita, Coréia do Sul, ")
                escreva("Irã, Japão.")
                escreval("")
                caso 4
                escreva("Os países que participaram são o: Egito, Nigéria.")
                escreval("")
                outrocaso
                escreva("informe um continete!")
                escreval("")
                fimescolha
                
fimalgoritmo
