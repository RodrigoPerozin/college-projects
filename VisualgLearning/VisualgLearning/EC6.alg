algoritmo "EC6"
// Função :  Desenvolva um algoritmo que peça ao usuário se ele já concluiu o
//           ensino médio. Se ainda não, diga que ele ainda não pode cursar uma
//           faculdade. Caso contrário, peça que curso ele deseja cursar dentre
//           os disponíveis na cidade, e informe quais faculdades da cidade possuem
//           o curso, baseando-se na tabela abaixo:

//  FACUJOI
//  Administração, Letras e Análise e Desenvolvimento de Sistemas
//  FACINFO Joinville
//  Análise e Desenvolvimento de Sistemas e Redes de Computadores
//  FAJEMAR
//  Biologia e Redes de Computadores

// Autor : rodrigo_perozin
// Data : 24/04/2019
var
     ensm : caractere
     numdcurso : inteiro
     
inicio

      escreval("responda com sim e não.")
      escreva("Você já concluiu o ensino médio? ")
      leia(ensm)
      limpatela

      se(ensm = "sim") ou (ensm = "s") ou (ensm = "ss")entao

         escreval("Menu de cursos disponíveis: ")
         escreval("1 - Administração")
         escreval("2 - letras")
         escreval("3 - Análise e Desenvolvimentos de Sistemas")
         escreval("4 - Redes de Computadores")
         escreval("5 -  Biologia")
         escreval("")
         escreva("informe o número do curso você gostaria de fazer: ")
         leia(numdcurso)
         
         escolha(numdcurso)
         caso 1
         limpatela
         escreva("faculdades disponíveis: FACUJOI")
         caso 2
         limpatela
         escreva("faculdades disponíveis: FACUJOI")
         caso 3
         limpatela
         escreva("faculdades disponíveis: FACUJOI, FACINFO Joinville")
         caso 4
         limpatela
         escreva("faculdades disponíveis: FAJEMAR, FACINFO Joinville")
         caso 5
         limpatela
         escreva("faculdades disponíveis: FAJEMAR")
         outrocaso
         limpatela
         escreva("Faça uma escolha válida!")
         fimescolha
         
         

      senao
      
      se(ensm = "nao") ou (ensm = "não") ou (ensm = "n") ou (ensm = "nn")entao
      escreva("você não pode cursar uma faculdade!!!")
      escreval("")
      senao
      limpatela
      escreva("!!!Nos de uma resposta clara!!!")
      escreva("")
      fimse
      fimse
fimalgoritmo
