algoritmo "EC7"
// Função : Faça um algoritmo para que o usuário insira o valor de um produto e
//          a forma de pagamento. O algoritmo deve então calcular o preço de venda
//          do seguinte modo:

//          Cheque: o usuário deve selecionar se será à vista ou à prazo e não há mudança no valor.
//          Cartão de crédito: o usuário deve selecionar se será à vista ou à prazo, sendo que à prazo acrescenta 5% no valor total.
//          Pagamento em boleto: é à vista e desconta 12% no valor total.
//          Pagamento em dinheiro:
//          Valor superior à R$300: é à vista e tem desconto de 5%.
//          Valor menor ou igual a R$ 300, ele é à vista e sem desconto.
//          Em todas as situações, ele deve mostrar como saída na tela quatro informações: valor do produto, forma de pagamento, se há ou não parcelamento e o valor final de venda.

// Autor : rodrigo_perozin
// Data : 24/04/2019

var

   val : real
   formadpag : inteiro
   voup : inteiro
   voup2 : inteiro
   valorserpago : real

inicio

      escreval("insira o preço do produto: ")
      leia(val)
      limpatela
      escreval("insira a forma de pagamento entre as opções: ")
      escreval("1 - Cheque.")
      escreval("2 - Cartão de crédito.")
      escreval("3 - Pagamento em boleto.")
      escreval("4 - Pagamento em dinheiro.")
      escreval("")
      escreva("informe o número que corresponde a sua forma de pagamento: ")
      leia(formadpag)
      escreval("")
      limpatela
      
      escolha(formadpag)
      
      caso 1
      
      escreval("1 - a vista.")
      escreval("2 - a prazo.")
      escreva("O número que corresponde a sua escolha é: ")
      leia(voup)
      limpatela
      se(voup = 1)entao
      escreval("O valor do produto é: ", val, "$")
      escreva("O valor a ser pago em cheque a vista é: ", val, "$")
      senao
      se(voup = 2)entao
      escreval("O valor do produto é: ", val, "$")
      escreva("O valor a ser pago em cheque com parcelamento é: ", val, "$")
      fimse
      fimse
      
      caso 2
                        
      escreval("1 - a vista.")
      escreval("2 - a prazo.")
      escreva("O número que corresponde a sua escolha é: ")
      leia(voup2)
      limpatela
      se(voup2 = 1)entao
      escreval("O valor do produto é: ", val, "$")
      escreva("O valor a ser pago em cartão de crédito a vista é: ", val, "$")
      senao
      se(voup2 = 2)entao
      valorserpago <- val + ((5 * val) / 100)
      escreval("O valor do produto é: ", val, "$")
      escreva("O valor a ser pago em cartão de crédito e parcelado com 5% a mais é: ", valorserpago, "$")
      fimse
      fimse
      
      caso 3
      valorserpago <- val - ((12 * val) /100)
      escreval("O valor do produto: ", val)
      escreva("O valor a ser pago em boleto não parcelado com 12% de desconto é: ", valorserpago, "$")
      
      caso 4
      se(val > 300)entao
      valorserpago <- val - ((5 * val) / 100)
      escreval("O valor do produto: ", val, "$")
      escreva("O valor a ser pago em dinheiro sem parcelamento com 5% de desconto: ", valorserpago, "$")
      senao
      se(val <= 300)entao
      escreval("o valor do produto é: ", val, "$")
      escreva("O valor a ser pago em dinheiro sem parcelamento é: ", val, "$")
      fimse
      fimse
      
      outrocaso
      
      escreva("#ERRO#")
      
      fimescolha
      
      
fimalgoritmo
