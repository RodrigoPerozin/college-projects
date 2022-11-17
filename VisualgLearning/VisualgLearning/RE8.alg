algoritmo "RE8"
// Função : Você foi contratado pelo JEC (Jaguatirica Esporte Clube) para programar a urna eletrônica da eleição da presidência do clube.
//          O programa deve dar as seguintes opções de voto:
// 15 - Giovane;
// 75 - Anderson;
// 99 - Bacori;
// 0 - Voto em branco;
// Outros valores - Voto nulo.

// Nas eleições do JEC, nem sempre todos os sócios comparecem para votar, então não tem como saber quantos votos serão contabilizados.
// Sendo assim, após cada voto, peça se há outro sócio aguardando para votar ou se a eleição deve ser encerrada.
// Ao se encerrar a eleição, você deve mostrar:
// Os votos de cada candidato, em branco e nulo;
// O resultado final da eleição.
// Saiba que há três possibilidades de resultado final:
// Eleição cancelada: Se a soma de votos em branco e nulos for maior do que a metade dos votos totais, avise que a eleição foi cancelada;
// Segundo turno: Quando a condição acima não for atendida e não houver um candidato isolado na liderança, avise que haverá um segundo turno e
//                os candidatos envolvidos (ex: se Giovane e Bacori tem 10 votos e Anderson tem 5, haverá um segundo turno entre Giovane e Bacori; se
//                os 3 empataram, irão os 3);
// Candidato eleito: Se nenhuma das condições acima for atendida, informe qual é o candidato eleito (o com mais votos).

// Autor : rodrigo_perozin
// Data : 27/05/2019

var
opcao: inteiro
giovane: inteiro
anderson: inteiro
bacori: inteiro
branco: inteiro
null: inteiro
proximosocio: inteiro
somabrancosenulos: inteiro
somadosvotos: inteiro
vencedor: caractere
metadedosvotos: real


inicio

repita

 escreval("!URNA ELETRONCIA!")
 escrevaL("")

 escreval("15 - Giovane.")
 escreval("75 - Anderson.")
 escreval("99 - Bacori.")
 escreval ("0 - Voto em branco.")
 escreval("Outros valores - Voto nulo.")
 escreval("")

 escreva("Informe qual foi a opção escolhida: ")
 leia(opcao)
 
/////////////////////////////////////////////

 se(opcao = 15)entao
    giovane <- giovane + 1
       senao
    se(opcao = 75)entao
       anderson <- anderson + 1
          senao
       se(opcao = 99)entao
          bacori <- bacori + 1
             senao
          se(opcao = 0)entao
             branco <- branco + 1
               senao
             null <- null + 1
          fimse
       fimse
    fimse
 fimse
 
/////////////////////////////////////////////

 escreva("Há algum outro sócio aguardando para votar? (1-SIM 2-NAO) :")
 leia(proximosocio)
 escreval("")
 limpatela

ate((proximosocio = 2)ou(proximosocio <> 1))

escreval("Resultados da Votação: ")
escreval("")

escreval("Giovane: ", giovane, " votos")
escreval("Anderson: ", anderson, " votos")
escreval("Bacori: ", bacori, " votos")
escreval("Votos brancos: ", branco, " votos")
escreval("Votos nulos: ", null, " votos")
////////////////////////////////////////////

   somadosvotos <- giovane + anderson + bacori + branco + null
   metadedosvotos <- somadosvotos / 2
   somabrancosenulos <- branco + null
   
se(somabrancosenulos > metadedosvotos)entao
 escreval("")
 escreval("As votações foram canceladas pois mais da metade dos votos foram nulos ou brancos.")
  senao
   se(giovane > anderson) E (giovane > bacori)entao
     vencedor <- "giovane!"
     escreval("")
     escreval("Vencedor: ", vencedor)
      senao
       se(anderson > giovane) E (anderson > bacori)entao
         vencedor <- "anderson!"
         escreval("")
         escreval("Vencedor: ", vencedor)
          senao
           se(bacori > anderson) E (giovane < bacori)entao
             vencedor <- "bacori"
             escreval("")
             escreval("Vencedor: ", vencedor)
              senao
               se((giovane = anderson) E (giovane <> bacori) E (bacori <> anderson))entao
                  escreval("")
                  escreval("haverá um segundo turno entre giovane e anderson.")
                   senao
                    se((anderson = bacori) E (giovane <> anderson) E (bacori <> giovani))entao
                    escreval("")
                    escreval("haverá um segundo turno entre anderson e bacori.")\
                     senao
                      se((bacori = giovane) E (bacori <> anderson) E (giovane <> anderson))entao
                       escreval("")
                       escreval("haverá um segunto turno entre bacori e giovane.")
                        senao
                         se((giovane = anderson) E (giovane = bacori) E (bacori = anderson))entao
                           escreval("")
                           escreval("haverá um segunto turno entre bacori, giovane e anderson.")
                             fimse
                         fimse
                    fimse
               fimse
           fimse
       fimse
   fimse
fimse

////////////////////////////////////////////


fimalgoritmo
