algoritmo "RE7"
// Função :  Faça um algoritmo que automaticamente passe um número de 1 a 50 a uma variável (pesquise a função Randi()
//           do VisuAlg no Google). O papel do usuário nesse algoritmo é adivinhar esse número. Para que ele tenha essa possibilidade,
//           o algoritmo deve dar ao usuário 5 chances para adivinhar esse número, e a cada chance pedir um número, e informar se esse
//           número é o número correto (e, nesse caso, encerrar o programa), ou se ele é maior ou menor que o número a ser adivinhado.
//           Caso o usuário não adivinhe o valor com essas 5 chances, o programa deve ser encerrado e o usuário deve saber que perdeu....
// Autor : rodrigo_perozin
// Data : 27/05/2019

var

  ramdom: inteiro
  contadora: inteiro
  tentativa: inteiro
  num2: inteiro

inicio

   ramdom <- Randi(49)
   ramdom <- ramdom + 1
   num2 <- 5

   repita

        escreval("Tente advinhar o número inteiro que estou a pensar entre 1 e 50: ")
        leia(tentativa)
        
        num2<- num2 - 1
        
        se(tentativa > ramdom)entao
         escreval("Errado, o número que estou a pensar é menor! Suas chances: ", num2)
          senao
           se(tentativa < ramdom)entao
            escreval("Errado, o número que estou a pensar é maior! Suas chances: ", num2)
             senao
              se(tentativa = ramdom)entao
               escreval("Correto! Você Acertou! Parabéns!")
             fimse
            fimse
           fimse
           
          se(num2 = 0) E (tentativa <> ramdom)entao
           escreval("!##YOU LOSE##!")
        fimse
        
ate((tentativa = ramdom) ou (num2 = 0))

fimalgoritmo
