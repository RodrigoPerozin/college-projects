algoritmo "PF7"
// Função : Você foi contratado pela Associação de Vendedores de Picolé Praianos
//          (AVPP) para desenvolver um software que ajude os vendedores e a empresa
//          a gerenciar suas vendas. A empresa trabalha com dois produtos: picolé de
//          fruta (R$ 1,25) e a base de leite (R$ 1,80). Semanalmente, mais especificamente
//          a cada terça-feira, os vendedores devem repassar para a empresa quantos
//          produtos de cada tipo foram vendidos a cada dia. Mas para facilitar o serviço da\
//          AVPP, você irá desenvolver um aplicativo para celular, que vai ser repassado
//          para cada um dos vendedores. Esse aplicativo será usado por ele a cada
//          terça-feira, e deve solicitar a quantidade vendida de cada produto por dia
//          para posteriormente mostrar ao vendedor:

//A quantidade vendida na semana de cada produto e o total geral de vendas;
//O faturamento em reais para cada produto e o total geral de faturamento;
//O dia em que houveram mais vendas para cada produto e o produto mais vendido na semana.
//Os dados não precisam estar necessariamente nessa ordem, portanto pense em mostrar essas informações da melhor maneira possível para o vendedor.

// Autor : rodrigo_perozin
// Data : 13/05/2019

var

    contadora1: inteiro
    qpic: inteiro
    qtotaldepic: inteiro
    totalgeradopic: real
    qleite: inteiro
    qtotaldeleite: inteiro
    totalgeradoleite: real
    qtotaldevendas: inteiro
    qtotaldefat: real
    diapic: inteiro
    dialeite: inteiro
    qmaiorpic: inteiro
    qmaiorleite: inteiro
    maisvend: caractere

inicio
         para contadora1 de 1 ate 7 passo 1 faca
              escreval("informe a quantidade de picolés de fruta vendidos no", contadora1, "°dia: ")
              leia(qpic)
              escreval("informe a quantidade de picolés a base de leite vendidos no ", contadora1, "° dia: ")
              leia(qleite)
              limpatela
        
         qtotaldepic <- qpic + qtotaldepic
         qtotaldeleite <- qleite + qtotaldeleite
         qtotaldevendas <- qtotaldeleite + qtotaldepic
         
         se(qpic > qmaiorpic)entao
         qmaiorpic <-  qpic
         diapic <- contadora1
         fimse
         
         se(qleite > qmaiorleite)entao
         qmaiorleite <- qleite
         dialeite <- contadora1
         fimse
         
        fimpara
        
        se(qtotaldepic > qtotaldeleite)entao
        maisvend <- "o de Fruta."
        senao
        se(qtotaldepic < qtotaldeleite)entao
        maisvend <- "de leite."
        senao
        se(qtotaldepic = qtotaldeleite)entao
        maisvend <- "os dois tipos de picolés."
        fimse
        fimse
        fimse
        

         totalgeradopic <- qtotaldepic * 1.25
         totalgeradoleite <- qtotaldeleite * 1.80
         qtotaldefat <- totalgeradoleite + totalgeradopic
        
        escreval("Você vendeu ", qtotaldepic, " picolés de fruta e", qtotaldeleite, " picolés a base de leite na semana.")
        escreval("Ao todo você vendeu", qtotaldevendas, " picolés.")
        escreval("E você teve", totalgeradopic, "$ ganhos com picolés de fruta e", totalgeradoleite, "$ com os de leite.")
        escreval("Você faturou", qtotaldefat, "$ ao todo.")
        escreval("O dia em que mais foi vendido picolé de Fruta foi no " , diapic , "º dia: " , qmaiorpic)
        escreval("O dia em que mais foi vendido picolé a base de leite foi no " , dialeite , "º dia: " , qmaiorleite)
        escreval("O picolé mais vendido na semana foi ", maisvend)

fimalgoritmo
